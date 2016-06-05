/**
 * 
 */
package com.tija.springtemplate.l6BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ttinana
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" In a postProcessBeforeInitialization, bean name: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" In a postProcessAfterInitialization, bean name: " + beanName);
		return bean;
	}

}
