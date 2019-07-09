package ro.ibt.querybuildercreator.enums;

import com.google.gson.annotations.SerializedName;

public enum Type {

	@SerializedName("string")
	STRING,

	@SerializedName("integer")
	INTEGER,

	@SerializedName("double")
	DOUBLE,

	@SerializedName("boolean")
	BOOLEAN,

	@SerializedName("datetime")
	DATETIME,

	@SerializedName("date")
	DATE,

	@SerializedName("time")
	TIME,

	@SerializedName("array")
	ARRAY,

	@SerializedName("NULL")
	NULL,

	@SerializedName("")
	UNKNOWN;
}
