package com.iamapunkmonkey.rabbit;

/**
 * Created by zbreman on 3/28/15.
 */
public enum COTypes {
	NONE(""),
	VOID("void"),
	INT("int"),
	STRING("String"),
	CHAR("char"),
	BOOLEAN("boolean"),
	FLOAT("float");

	final String value;

	COTypes(String s){
		this.value = s;
	}
}
