package com.xworks.works.internal;

public class SchoolImpl extends School {

	@Override
	void higherPrimary() {
		System.out.println("higherPrimary in SchoolImpl ");
	}
	
//as school is having one concrete method even though it is absract class
//we have not over riden all methods so it not complete abstraction	

}
