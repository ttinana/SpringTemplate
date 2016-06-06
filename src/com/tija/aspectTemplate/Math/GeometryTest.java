package test.com.tija.aspectTemplate.Math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tija.springtemplate.l2constructorInjection.Geometry;

public class GeometryTest {
	
	String name = "Integral";
	Geometry geometryUtil = new Geometry(name, 5);

	@Test
	public void testPrintMessage() {
		//System.out.println("Inside testPrintMessageL2()");
		assertEquals(name, geometryUtil.getType());
		System.out.println("In GeometryTest!");
	}

}
