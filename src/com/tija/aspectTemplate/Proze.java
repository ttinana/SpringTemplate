/**
 * 
 */
package com.tija.aspectTemplate;

/**
 * @author ttinana
 *
 */
public class Proze {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameAOP() {
		return "AOP FOR CLASS: " + name;
	}

}
