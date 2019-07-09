package ro.ibt.querybuildercreator.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ro.ibt.querybuildercreator.enums.Type;

/**
 * Valid combinations of a Type and a Value's Type.
 * 
 * @author alin
 *
 */
public class TypesValueTypes
{
	private final static Map<Type, List<Type>> map;

	static {
		Map<Type, List<Type>> tempMap = new HashMap<Type, List<Type>>();

		List<Type> STRING_VALUETYPES = Arrays.asList(new Type[] { Type.STRING, Type.ARRAY, Type.NULL });
		List<Type> INTEGER_VALUETYPES = Arrays.asList(new Type[] { Type.INTEGER, Type.ARRAY, Type.NULL });
		List<Type> DOUBLE_VALUETYPES = Arrays.asList(new Type[] { Type.DOUBLE, Type.ARRAY, Type.NULL });
		List<Type> BOOLEAN_VALUETYPES = Arrays.asList(new Type[] { Type.BOOLEAN, Type.NULL });
		List<Type> DATETIME_VALUETYPES = Arrays.asList(new Type[] { Type.DATETIME, Type.ARRAY, Type.NULL });
		List<Type> DATE_VALUETYPES = Arrays.asList(new Type[] { Type.DATE, Type.ARRAY, Type.NULL });
		List<Type> TIME_VALUETYPES = Arrays.asList(new Type[] { Type.TIME, Type.ARRAY, Type.NULL });

		tempMap.put(Type.STRING, STRING_VALUETYPES);
		tempMap.put(Type.INTEGER, INTEGER_VALUETYPES);
		tempMap.put(Type.DOUBLE, DOUBLE_VALUETYPES);
		tempMap.put(Type.BOOLEAN, BOOLEAN_VALUETYPES);
		tempMap.put(Type.DATETIME, DATETIME_VALUETYPES);
		tempMap.put(Type.DATE, DATE_VALUETYPES);
		tempMap.put(Type.TIME, TIME_VALUETYPES);

		map = Collections.unmodifiableMap(tempMap);
	}

	public static Map<Type, List<Type>> getTypesValueTypes() {

		return map;
	}
}
