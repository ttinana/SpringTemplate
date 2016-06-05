package com.tija.springtemplate.l4InnerBean;

import com.tija.springtemplate.l8CodingToInterfaces.Subject;

public class Calculus implements Subject{
	
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
	
	// prints Calculus
	@Override
	public void calculate() {
		System.out.println("Inside calculus: " + getName()+ " theorem: " +getTheorem().getName() +" childTheorem: " + getChildTheorem().getName());
	}

}
