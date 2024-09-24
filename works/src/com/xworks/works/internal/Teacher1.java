package com.xworks.works.internal;

public class Teacher1 implements Students {

	@Override
	public void boys() {
		System.out.println("boys in Teacher1");

//we need to over-ride all the abstract methods from the interface
//but its developers wish to over ride the default method in interface
//so here in Students interface boys is an abstract method so
//we must overide that method while implementing but as girls method
//is default so we can over-ride if required .

	}

}
