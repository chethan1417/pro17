package com.xworks.inheritance.things;

public abstract class Provider {
	
	private String name;
	private String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}
	
	public abstract void service();
}
