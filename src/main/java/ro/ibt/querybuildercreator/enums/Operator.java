package ro.ibt.querybuildercreator.enums;

import com.google.gson.annotations.SerializedName;

public enum Operator {

	@SerializedName("equal")
	EQUAL,

	@SerializedName("not_equal")
	NOT_EQUAL,

	@SerializedName("is_null")
	IS_NULL,

	@SerializedName("is_not_null")
	IS_NOT_NULL,

	@SerializedName("in")
	IN,

	@SerializedName("not_in")
	NOT_IN,

	@SerializedName("less")
	LESS,

	@SerializedName("less_or_equal")
	LESS_OR_EQUAL,

	@SerializedName("greater")
	GREATER,

	@SerializedName("greater_or_equal")
	GREATER_OR_EQUAL,

	@SerializedName("between")
	BETWEEN,

	@SerializedName("not_between")
	NOT_BETWEEN,

	@SerializedName("begins_with")
	BEGINS_WITH,

	@SerializedName("not_begins_with")
	NOT_BEGINS_WITH,

	@SerializedName("contains")
	CONTAINS,

	@SerializedName("not_contains")
	NOT_CONTAINS,

	@SerializedName("ends_with")
	ENDS_WITH,

	@SerializedName("not_ends_with")
	NOT_ENDS_WITH,

	@SerializedName("is_empty")
	IS_EMPTY,

	@SerializedName("is_not_empty")
	IS_NOT_EMPTY;
}
