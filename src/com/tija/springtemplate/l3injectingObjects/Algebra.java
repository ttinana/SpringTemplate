package com.tija.springtemplate.l3injectingObjects;

public class Algebra {
	
	String name;
	AlgTheorem theorem;
	AlgTheorem childTheorem;
	
	

	public Algebra(String name) {
		super();
		this.name = name;
	}

	
	public Algebra(String name, AlgTheorem theorem, AlgTheorem childTheorem) {
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

	public AlgTheorem getTheorem() {
		return theorem;
	}

	public void setTheorem(AlgTheorem theorem) {
		this.theorem = theorem;
	}
	
	public AlgTheorem getChildTheorem() {
		return childTheorem;
	}

	public void setChildTheorem(AlgTheorem childTheorem) {
		this.childTheorem = childTheorem;
	}

	public void printAlgebra(){
		System.out.println("Inside algebra: " + getName()+ " theorem: " +getTheorem().getName() +" childTheorem: " + getChildTheorem().getName());
	}

}
