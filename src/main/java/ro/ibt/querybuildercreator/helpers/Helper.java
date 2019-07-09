package ro.ibt.querybuildercreator.helpers;

import java.util.Arrays;
import java.util.List;

import ro.ibt.querybuildercreator.classes.OperatorsValueTypes;
import ro.ibt.querybuildercreator.classes.TypesOperators;
import ro.ibt.querybuildercreator.classes.TypesValueTypes;
import ro.ibt.querybuildercreator.enums.Operator;
import ro.ibt.querybuildercreator.enums.Type;
import ro.ibt.querybuildercreator.exceptions.RuleConstructionException;

public class Helper
{
	/**
	 * Return the type of a value
	 * 
	 * @param value
	 * @return
	 */
	public static Type getValueType(Object value) {

		if (value == null) return Type.NULL;

		switch (value.getClass().getSimpleName()) {

			case "String":
				return Type.STRING;
			case "int":
				return Type.INTEGER;
			case "Integer":
				return Type.INTEGER;
			case "double":
				return Type.DOUBLE;
			case "Double":
				return Type.DOUBLE;
			case "boolean":
				return Type.BOOLEAN;
			case "Boolean":
				return Type.BOOLEAN;
			case "String[]":
				return Type.ARRAY;
			case "int[]":
				return Type.ARRAY;
			case "Integer[]":
				return Type.ARRAY;
			case "double[]":
				return Type.ARRAY;
			case "Double[]":
				return Type.ARRAY;
			case "boolean[]":
				return Type.ARRAY;
			case "Boolean[]":
				return Type.ARRAY;
			case "LocalDateTime":
				return Type.DATETIME;
			case "LocalDate":
				return Type.DATE;
			case "LocalTime":
				return Type.TIME;
			default:
				return Type.UNKNOWN;
		}
	}

	/**
	 * Validate if the operator can be applied on provided type
	 * 
	 * @param type
	 * @param operator
	 * @throws RuleConstructionException
	 */
	public static void validateTypeOperator(Type type, Operator operator) throws RuleConstructionException {

		if (!TypesOperators.getTypesOperators().get(type).contains(operator)) {

			throw new RuleConstructionException(String.format("Invalid operator %s for type %s", type, operator));
		}
	}

	/**
	 * Calculate the type of provided value and check if that calculated type is accepted for provided type field
	 * 
	 * @param type
	 * @param value
	 * @throws RuleConstructionException
	 */
	public static void validateTypeValueType(Type type, Object value) throws RuleConstructionException {

		// get type of value passed
		Type valueType = getValueType(value);

		if (!TypesValueTypes.getTypesValueTypes().get(type).contains(valueType)) {

			throw new RuleConstructionException(String.format("Invalid type of value %s for provided type %s", valueType, type));
		}
	}

	/**
	 * Validate is the operator can be applied on provided value
	 * 
	 * @param operator
	 * @param value
	 * @throws RuleConstructionException
	 */
	public static void validateOperatorValueType(Operator operator, Object value) throws RuleConstructionException {

		// get type of value passed
		Type valueType = getValueType(value);

		if (!OperatorsValueTypes.getOperatorsValueTypes().get(operator).contains(valueType)) {

			throw new RuleConstructionException(String.format("Invalid type of value %s for provided operator %s", valueType, operator));
		}
	}

	/**
	 * Validate if all elements values in the array are of the proper type
	 * 
	 * @param type
	 * @param value
	 * @throws RuleConstructionException
	 */
	public static void validateValueIsArray(Type type, Object value) throws RuleConstructionException {

		// get type of value passed
		Type valueType = getValueType(value);

		if (valueType.equals(Type.ARRAY)) {

			// convert array to list
			List<Object> arrayElements = Arrays.asList(value);

			// iterate each list element
			for (Object arrayElement : arrayElements) {

				// get type of value passed
				Type elementValueType = getValueType(arrayElement);

				if (!TypesValueTypes.getTypesValueTypes().get(type).contains(elementValueType)) {

					throw new RuleConstructionException(String.format("Invalid type of array element %s for provided type %s", elementValueType, type));
				}
			}
		}
	}

	/**
	 * When operator is 'between' or 'not_between', the object value must be an array of 2 elements.
	 * 
	 * @param operator
	 * @param value
	 * @throws RuleConstructionException
	 */
	public static void validateOperatorIsBetween(Operator operator, Object value) throws RuleConstructionException {

		// get type of value passed
		Type valueType = getValueType(value);

		if ((operator.equals(Operator.BETWEEN) || operator.equals(Operator.NOT_BETWEEN))) {

			if (!valueType.equals(Type.ARRAY)) {

				throw new RuleConstructionException(String.format("Invalid type of value %s for provided operator type %s - an array is required", valueType, operator));
			}

			// convert array to list
			List<Object> arrayElements = Arrays.asList(value);

			if (arrayElements.size() != 2) {

				throw new RuleConstructionException(String.format("Invalid number of elements %d in provided value array - provided operator type %s requires 2 elements", arrayElements.size(), operator));
			}
		}
	}
}
