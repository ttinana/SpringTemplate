package com.tija.springtemplate.l5InitializingCollections;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.tija.springtemplate.l8CodingToInterfaces.Subject;

public class Mathematics implements Subject, ApplicationContextAware {
	ApplicationContext aplicationContext;
	private String name;
	private List<MathSubject> subjects;

	public Mathematics() {
		super();
	}

	public Mathematics(String name, List<MathSubject> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MathSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<MathSubject> subjects) {
		this.subjects = subjects;
	}

	// print Mathematics
	@Override
	public void calculate() {
		for (MathSubject subject : subjects) {
			System.out.println("Inside calculus: " + getName() + " theorem: " + subject.getName());
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.aplicationContext = applicationContext;

	}
}
