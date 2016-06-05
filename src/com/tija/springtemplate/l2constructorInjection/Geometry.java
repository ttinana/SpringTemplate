/**
 * 
 */
package com.tija.springtemplate.l2constructorInjection;

/**
 * @author ttinana
 *
 */
public class Geometry {
	private String type;
	private int favorite;

	public Geometry() {
	}

	public Geometry(String type) {
		this.type = type;
	}

	public Geometry(int favorite) {
		this.favorite = favorite;
	}

	public Geometry(String type, int favorite) {
		this.type = type;
		this.favorite = favorite;
	}

	public String getType() {
		return type;
	}

	public int getFavorite() {
		return favorite;
	}

	public void defineGeometry() {
		System.out.println("Speciallyty ::" + getType() + ":: geometry." + getFavorite());
	}

}
