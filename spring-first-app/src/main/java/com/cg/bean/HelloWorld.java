package com.cg.bean;

import java.util.List;

public class HelloWorld {
	String name;
	private List<String> course;
//	public HelloWorld() {
////		super();
//	}
//	public HelloWorld(String name) {
//		this.name=name;
//	}
	
	public String getName() {
		return name;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello(){
		return "Hello "+ name+" !";
	}
	
}
