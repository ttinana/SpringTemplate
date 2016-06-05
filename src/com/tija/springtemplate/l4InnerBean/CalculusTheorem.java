package com.tija.springtemplate.l4InnerBean;

public class CalculusTheorem {
	String name;
	String text;
	
	public CalculusTheorem() {
	}
	
	public CalculusTheorem(String name, String text) {
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
