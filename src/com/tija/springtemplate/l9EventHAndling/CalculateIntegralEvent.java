package com.tija.springtemplate.l9EventHAndling;

import org.springframework.context.ApplicationEvent;

public class CalculateIntegralEvent extends ApplicationEvent{

	public CalculateIntegralEvent(Object source) {
		super(source);
		
	}
	public String toString(){
		return " |PUBLISHING| Calculate integral published. ";
		
	}

}
