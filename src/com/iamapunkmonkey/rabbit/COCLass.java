package com.iamapunkmonkey.rabbit;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class COClass extends CodeObject {
	HashMap<String, COMethod> methods = new HashMap<String, COMethod>();

	public COClass(String name, COVisibility visibility) {
		this.objectType = COObjectType.CLASS;
		this.name = name;
		this.visibility = visibility;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void createMethod(COVisibility visibility,
							 boolean isStatic,
							 COTypes type,
							 String name,
							 List<COArguments> args) {
		COMethod m = new COMethod();
		m.setVisibility(visibility);
		m.isStatic(isStatic);
		m.setType(type);
		m.setName(name);
		m.setArgs(args);
		methods.put(name, m);

	}

	@Override
	public StringBuilder writeCode(StringBuilder file){
//		file.add("public " + this.name + "{");
		file.append(visibility.value);
		file.append(" class ");
		file.append(name);
		file.append("{");
		file.append("\n");
		Collection<COMethod> method = methods.values();

		for(COMethod m : method.toArray(new COMethod[0])){
			m.writeCode(file);
		}
		file.append("\n");
		file.append("}");

		return file;
	}
}
