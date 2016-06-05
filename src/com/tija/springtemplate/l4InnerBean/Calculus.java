package com.tija.springtemplate.l4InnerBean;

public class Calculus {
	
	String name;
	CalculusTheorem theorem;
	CalculusTheorem childTheorem;
	public Calculus(String name, CalculusTheorem theorem, CalculusTheorem childTheorem) {
		super();
		this.name = name;
		this.theorem = theorem;
		this.childTheorem = childTheorem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CalculusTheorem getTheorem() {
		return theorem;
	}
	public void setTheorem(CalculusTheorem theorem) {
		this.theorem = theorem;
	}
	public CalculusTheorem getChildTheorem() {
		return childTheorem;
	}
	public void setChildTheorem(CalculusTheorem childTheorem) {
		this.childTheorem = childTheorem;
	}
	
	public void printCalculus(){
		System.out.println("Inside calculus: " + getName()+ " theorem: " +getTheorem().getName() +" childTheorem: " + getChildTheorem().getName());
	}

}
