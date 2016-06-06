package test.com.tija.aspectTemplate.Math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tija.springtemplate.l2constructorInjection.Geometry;

public class MathJUnitTest {

	String type = "Euclid";
	Geometry geometry = new Geometry(type);

	@Test
	public void testPrintMessage() {
		assertEquals(type, geometry.getType());
	}

}
