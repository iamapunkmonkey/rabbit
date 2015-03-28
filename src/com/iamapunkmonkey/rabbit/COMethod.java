package com.iamapunkmonkey.rabbit;

import java.util.ArrayList;
import java.util.List;

public class COMethod extends CodeObject {
	List<COArguments> args = new ArrayList<COArguments>();
	List<COActions> actions = new ArrayList<COActions>();

	public COMethod(){
		this.objectType = COObjectType.METHOD;
	}

	public void setVisibility(COVisibility visibility) {
		this.visibility = visibility;
	}

	public void isStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public void setType(COTypes type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArgs(List<COArguments> args) {
		this.args = args;
	}

	public void addAction(String action) {
		COActions a = new COActions();
		a.addAction(action);
		actions.add(a);
	}

	@Override
	public StringBuilder writeCode(StringBuilder file) {

		file.append(visibility.value);
		file.append(" ");
		if(isStatic)
			file.append("static ");
		file.append("");
		file.append(type.value);
		file.append(" ");
		file.append(name);
		file.append("(");
		for(COArguments coa : args.toArray(new COArguments[0])){
			file.append(coa.type.value);
			if(coa.isArray)
				file.append("[]");
			file.append(" ");
			file.append(coa.name);
		}
		file.append(")");
		file.append("{");
		file.append("\n");
		for(COActions coa : actions.toArray(new COActions[0])){
			for(String action : coa.actions.toArray(new String[0])){
				file.append(action);
				file.append("\n");
			}
		}
		file.append("}");
		return file;
	}
}
