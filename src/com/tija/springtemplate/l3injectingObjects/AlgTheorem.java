package com.tija.springtemplate.l3injectingObjects;

public class AlgTheorem {
	String name;
	String text;

	public AlgTheorem() {
	}

	public AlgTheorem(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void printTheorem(){
		System.out.println("Inside theorem: " + getName());
	}

}
