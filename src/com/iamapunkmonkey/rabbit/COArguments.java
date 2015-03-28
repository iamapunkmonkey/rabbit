package com.iamapunkmonkey.rabbit;

/**
 * Created by zbreman on 3/28/15.
 */
public class COArguments extends CodeObject {
	public boolean isArray;

	public void setType(COTypes type) {
		this.type = type;
	}

	public void isArray(boolean isArray) {
		this.isArray = isArray;
	}

	public void setName(String name) {
		this.name = name;
	}
}
