/**
 * 
 */
package com.tija.springtemplate.l1setterInjection;

/**
 * @author ttinana
 *
 */
public class Integral {
	
	private String type;
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void calculate(){
		System.out.println("Calculating ::"+ getType() +":: integral.");
	}

}
