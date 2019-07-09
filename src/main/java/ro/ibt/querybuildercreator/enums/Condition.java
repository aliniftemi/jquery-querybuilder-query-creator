package ro.ibt.querybuildercreator.enums;

public enum Condition {

	AND("AND"), OR("OR");

	private String condition;

	Condition(String condition) {

		this.condition = condition;
	}

	public String getCondition() {

		return this.condition;
	}
}
