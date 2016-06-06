/**
 * 
 */
package com.tija.aspectTemplate.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author ttinana
 *
 */
@Aspect
public class LoggingAspect {
	/*
	 * standard annotation to make our advise methods to run BEFORE run methods
	 */

	@Before("execution(public String getName()) || execution(public String com.tija.aspectTemplate.Poetry.getNameAOP())")
	// @Before("execution(public String
	// com.tija.aspectTemplate.Poetry.getName())") // in specific class before
	// method
	// @Before("execution(public String getName())") // in all classes before
	// method
	// @Before("execution(public String get*())") // for all getters that return string -wildcards
	// @Before("execution(public * get*(..))") // for all getters -wildcards check .

	public void LoggingAdvice() {
		System.out.println("|ASPECT| Advice run. Get method is called. |ASPECT|");
	}
	
	@Before("execution(allGetters())")
	public void LoggingAdvice1() {
		System.out.println("|ASPECT 1 pointcut 1|");
	}
	
	@Before("execution(allGetters())")
	public void LoggingAdvice2() {
		System.out.println("|ASPECT 2 pointcut 1|");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){
		
	}

}
