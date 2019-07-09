package ro.ibt.querybuildercreator.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ro.ibt.querybuildercreator.enums.Operator;
import ro.ibt.querybuildercreator.enums.Type;

/**
 * Valid combinations of a Type and an Operator.
 * 
 * @author alin
 *
 */
public class TypesOperators
{
	private final static Map<Type, List<Operator>> map;

	static {
		Map<Type, List<Operator>> tempMap = new HashMap<Type, List<Operator>>();

		List<Operator> STRING = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.BEGINS_WITH, Operator.NOT_BEGINS_WITH, Operator.CONTAINS, Operator.NOT_CONTAINS, Operator.ENDS_WITH, Operator.NOT_ENDS_WITH, Operator.IS_EMPTY, Operator.IS_NOT_EMPTY });
		List<Operator> INTEGER = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.LESS, Operator.LESS_OR_EQUAL, Operator.GREATER, Operator.GREATER_OR_EQUAL, Operator.BETWEEN, Operator.NOT_BETWEEN });
		List<Operator> DOUBLE = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.LESS, Operator.LESS_OR_EQUAL, Operator.GREATER, Operator.GREATER_OR_EQUAL, Operator.BETWEEN, Operator.NOT_BETWEEN });
		List<Operator> BOOLEAN = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IS_NULL, Operator.IS_NOT_NULL });
		List<Operator> DATETIME = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.LESS, Operator.LESS_OR_EQUAL, Operator.GREATER, Operator.GREATER_OR_EQUAL, Operator.BETWEEN, Operator.NOT_BETWEEN });
		List<Operator> DATE = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.LESS, Operator.LESS_OR_EQUAL, Operator.GREATER, Operator.GREATER_OR_EQUAL, Operator.BETWEEN, Operator.NOT_BETWEEN });
		List<Operator> TIME = Arrays.asList(new Operator[] { Operator.EQUAL, Operator.NOT_EQUAL, Operator.IN, Operator.NOT_IN, Operator.IS_NULL, Operator.IS_NOT_NULL, Operator.LESS, Operator.LESS_OR_EQUAL, Operator.GREATER, Operator.GREATER_OR_EQUAL, Operator.BETWEEN, Operator.NOT_BETWEEN });

		tempMap.put(Type.STRING, STRING);
		tempMap.put(Type.INTEGER, INTEGER);
		tempMap.put(Type.DOUBLE, DOUBLE);
		tempMap.put(Type.BOOLEAN, BOOLEAN);
		tempMap.put(Type.DATETIME, DATETIME);
		tempMap.put(Type.DATE, DATE);
		tempMap.put(Type.TIME, TIME);

		map = Collections.unmodifiableMap(tempMap);
	}

	public static Map<Type, List<Operator>> getTypesOperators() {

		return map;
	}
}
