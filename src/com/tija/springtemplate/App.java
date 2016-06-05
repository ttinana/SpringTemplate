/**
 * 
 */
package com.tija.springtemplate;

import java.beans.beancontext.BeanContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tija.springtemplate.l1setterInjection.Integral;
import com.tija.springtemplate.l2constructorInjection.Geometry;
import com.tija.springtemplate.l3injectingObjects.Algebra;
import com.tija.springtemplate.l4InnerBean.Calculus;
import com.tija.springtemplate.l5InitializingCollections.Mathematics;

/**
 * @author ttinana
 *
 */
public class App {
	static final Logger logger = LoggerFactory.getLogger(App.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("starting App.");

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			context.registerShutdownHook();
			context.getBean("integral");

			// AbstractApplicationContext context = new
			// ClassPathXmlApplicationContext("applicationContext.xml");
			// context.registerShutdownHook();

			// Bean Property Initialization :: Setter Injection
			Integral integral = (Integral) context.getBean("integral");
			integral.calculate();

			// Bean Property Initialization :: Constructor Injection
			Geometry geometry = (Geometry) context.getBean("geometry");
			geometry.defineGeometry();

			Algebra algebra = (Algebra) context.getBean("algebra");
			algebra.printAlgebra();

			Calculus calculus = (Calculus) context.getBean("calculusAlias");
			calculus.printCalculus();

			Mathematics mathematics = (Mathematics) context.getBean("mathematics");
			mathematics.printMAthematics();
		} catch (BeansException e) {
			logger.error("|ERROR|   ClassPathXmlApplicationContext(applicationContext.xml) unreachable " + e);
		}
	}

}
