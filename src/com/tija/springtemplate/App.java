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
import com.tija.springtemplate.l8CodingToInterfaces.Subject;

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

			// Bean Property Initialization :: Setter Injection
			Subject subject = (Subject) context.getBean("integral");
			subject.calculate();

			// Bean Property Initialization :: Constructor Injection
			Subject subject1 = (Subject) context.getBean("geometry");
			subject1.calculate();

			Subject subject2 = (Subject) context.getBean("algebra");
			subject2.calculate();

			Subject subject3 = (Subject) context.getBean("calculusAlias");
			subject3.calculate();

			Subject subjectMain = (Subject) context.getBean("mathematics");
			subjectMain.calculate();
			
		} catch (BeansException e) {
			logger.error("|ERROR|   ClassPathXmlApplicationContext(applicationContext.xml) unreachable " + e);
		}
	}

}
