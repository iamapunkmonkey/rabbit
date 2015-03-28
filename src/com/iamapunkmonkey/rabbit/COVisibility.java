package com.iamapunkmonkey.rabbit;

public enum COVisibility {
	NONE(""),
	PUBLIC("public"),
	PRIVATE("private"),
	PROTECTED("protected");

	final String value;

	COVisibility(String s) {
		this.value = s;
	}

}
