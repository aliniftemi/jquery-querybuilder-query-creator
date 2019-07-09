package ro.ibt.querybuildercreator.models;

import ro.ibt.querybuildercreator.enums.Operator;
import ro.ibt.querybuildercreator.enums.Type;
import ro.ibt.querybuildercreator.exceptions.RuleConstructionException;
import ro.ibt.querybuildercreator.helpers.Helper;
import ro.ibt.querybuildercreator.interfaces.RuleInterface;

public class Rule implements RuleInterface
{
	private String id;

	private String field;

	private Type type;

	private Operator operator;

	private Object value;

	public Rule(String idfield, Type type, Operator operator, Object value) throws RuleConstructionException {

		// perform some validations
		Helper.validateTypeOperator(type, operator);
		Helper.validateTypeValueType(type, value);
		Helper.validateOperatorValueType(operator, value);
		Helper.validateValueIsArray(type, value);
		Helper.validateOperatorIsBetween(operator, value);

		// perform the assignments
		this.id = idfield;
		this.field = idfield;
		this.type = type;
		this.operator = operator;
		this.value = value;
	}

	public String getId() {

		return this.id;
	}

	public String getField() {

		return this.field;
	}

	public Type getType() {

		return this.type;
	}

	public Operator getOperator() {

		return this.operator;
	}

	public Object getValue() {

		return this.value;
	}
}
