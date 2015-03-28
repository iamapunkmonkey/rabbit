package com.iamapunkmonkey.rabbit;

import java.util.List;

public class CodeObject {
	String name = "";
	COTypes type = COTypes.NONE;
	COVisibility visibility = COVisibility.NONE;
	Boolean isStatic = false;
	COObjectType objectType = COObjectType.NONE;
	public StringBuilder writeCode(StringBuilder file) {
		return file;
	}
}
