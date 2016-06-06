package test.com.tija.aspectTemplate.Math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tija.springtemplate.l4InnerBean.Calculus;
import com.tija.springtemplate.l4InnerBean.CalculusTheorem;

public class CalculusTest {
	
	String name = "Calculus";
	CalculusTheorem theorem1= new CalculusTheorem("first", "first calculus theorem");
	CalculusTheorem theorem2= new CalculusTheorem("second", "second calculus theorem");
	Calculus calcUtil = new Calculus(name,theorem1, theorem2);

	@Test
	public void testPrintMessage() {
		//System.out.println("Inside testPrintMessageL2()");
		assertEquals(name, calcUtil.getName());
		System.out.println("In CalculusTest!");
		
	}

}
