/**
 * 
 */
package com.tija.springtemplate.l1setterInjection;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.tija.springtemplate.l8CodingToInterfaces.Subject;
import com.tija.springtemplate.l9EventHAndling.CalculateIntegralEvent;

/**
 * @author ttinana
 *
 */
public class Integral implements Subject, ApplicationEventPublisherAware{
	
	private String type;
	private ApplicationEventPublisher applicationEventPublisher;
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void calculate(){
		System.out.println("Calculating ::"+ getType() +":: integral.");
		CalculateIntegralEvent event = new CalculateIntegralEvent(this);
		applicationEventPublisher.publishEvent(event);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
		
	}

}
