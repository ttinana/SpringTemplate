package com.tija.springtemplate.l5InitializingCollections;

public class MathSubject {
	
	String name;
	String text;
	
	public MathSubject() {
	}
	
	public MathSubject(String name, String text) {
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
	
	public void printMathSubject(){
		System.out.println("Inside MathSubject: " + getName());
	}
	

	

}
