package com.iamapunkmonkey.rabbit;

import java.util.ArrayList;
import java.util.List;

public class COApplication {
	List<CodeObject> codeObjects = new ArrayList<CodeObject>();
	String appName;
	String mainClass;

	public COApplication(String name) {
		appName = name;

		createClass(name);
	}

	private void createClass(String name) {
		COClass c = new COClass(name, COVisibility.PUBLIC);
		this.mainClass = name;
		createEntryPoint(c);
		codeObjects.add(c);
	}

	private void createEntryPoint(COClass c) {
		List<COArguments> args = new ArrayList<COArguments>();
		COArguments arg = new COArguments();
		arg.setType(COTypes.STRING);
		arg.isArray(true);
		arg.setName("args");
		args.add(arg);
		c.createMethod(COVisibility.PUBLIC, true, COTypes.VOID, "main", args);
		c.methods.get("main").addAction("System.out.println(\"Hello World\");");
	}

	public StringBuilder writeCode() {
//		List<String> file = new ArrayList<String>();
		StringBuilder file = new StringBuilder();
		for(CodeObject co : codeObjects.toArray(new CodeObject[0])){
			co.writeCode(file);
		}

		return file;
	}
}
