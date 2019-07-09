package ro.ibt.querybuildercreator.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ro.ibt.querybuildercreator.enums.Operator;
import ro.ibt.querybuildercreator.enums.Type;

public class OperatorsValueTypes
{
	private final static Map<Operator, List<Type>> map;

	static {
		Map<Operator, List<Type>> tempMap = new HashMap<Operator, List<Type>>();

		List<Type> EQUAL = Arrays.asList(new Type[] { Type.STRING, Type.INTEGER, Type.DOUBLE, Type.BOOLEAN, Type.DATETIME, Type.DATE, Type.TIME });
		List<Type> NOT_EQUAL = Arrays.asList(new Type[] { Type.STRING, Type.INTEGER, Type.DOUBLE, Type.BOOLEAN, Type.DATETIME, Type.DATE, Type.TIME });

		List<Type> IN = Arrays.asList(new Type[] { Type.ARRAY });
		List<Type> NOT_IN = Arrays.asList(new Type[] { Type.ARRAY });
		List<Type> BETWEEN = Arrays.asList(new Type[] { Type.ARRAY });
		List<Type> NOT_BETWEEN = Arrays.asList(new Type[] { Type.ARRAY });

		List<Type> LESS = Arrays.asList(new Type[] { Type.INTEGER, Type.DOUBLE, Type.DATETIME, Type.DATE, Type.TIME });
		List<Type> LESS_OR_EQUAL = Arrays.asList(new Type[] { Type.INTEGER, Type.DOUBLE, Type.DATETIME, Type.DATE, Type.TIME });
		List<Type> GREATER = Arrays.asList(new Type[] { Type.INTEGER, Type.DOUBLE, Type.DATETIME, Type.DATE, Type.TIME });
		List<Type> GREATER_OR_EQUAL = Arrays.asList(new Type[] { Type.INTEGER, Type.DOUBLE, Type.DATETIME, Type.DATE, Type.TIME });

		List<Type> BEGINS_WITH = Arrays.asList(new Type[] { Type.STRING });
		List<Type> NOT_BEGINS_WITH = Arrays.asList(new Type[] { Type.STRING });
		List<Type> CONTAINS = Arrays.asList(new Type[] { Type.STRING });
		List<Type> NOT_CONTAINS = Arrays.asList(new Type[] { Type.STRING });
		List<Type> ENDS_WITH = Arrays.asList(new Type[] { Type.STRING });
		List<Type> NOT_ENDS_WITH = Arrays.asList(new Type[] { Type.STRING });

		List<Type> IS_EMPTY = Arrays.asList(new Type[] { Type.NULL });
		List<Type> IS_NOT_EMPTY = Arrays.asList(new Type[] { Type.NULL });
		List<Type> IS_NULL = Arrays.asList(new Type[] { Type.NULL });
		List<Type> IS_NOT_NULL = Arrays.asList(new Type[] { Type.NULL });

		tempMap.put(Operator.EQUAL, EQUAL);
		tempMap.put(Operator.NOT_EQUAL, NOT_EQUAL);
		tempMap.put(Operator.IN, IN);
		tempMap.put(Operator.NOT_IN, NOT_IN);
		tempMap.put(Operator.BETWEEN, BETWEEN);
		tempMap.put(Operator.NOT_BETWEEN, NOT_BETWEEN);
		tempMap.put(Operator.LESS, LESS);
		tempMap.put(Operator.LESS_OR_EQUAL, LESS_OR_EQUAL);
		tempMap.put(Operator.GREATER, GREATER);
		tempMap.put(Operator.GREATER_OR_EQUAL, GREATER_OR_EQUAL);
		tempMap.put(Operator.BEGINS_WITH, BEGINS_WITH);
		tempMap.put(Operator.NOT_BEGINS_WITH, NOT_BEGINS_WITH);
		tempMap.put(Operator.CONTAINS, CONTAINS);
		tempMap.put(Operator.NOT_CONTAINS, NOT_CONTAINS);
		tempMap.put(Operator.ENDS_WITH, ENDS_WITH);
		tempMap.put(Operator.NOT_ENDS_WITH, NOT_ENDS_WITH);
		tempMap.put(Operator.IS_EMPTY, IS_EMPTY);
		tempMap.put(Operator.IS_NOT_EMPTY, IS_NOT_EMPTY);
		tempMap.put(Operator.IS_NULL, IS_NULL);
		tempMap.put(Operator.IS_NOT_NULL, IS_NOT_NULL);

		map = Collections.unmodifiableMap(tempMap);
	}

	public static Map<Operator, List<Type>> getOperatorsValueTypes() {

		return map;
	}
}
