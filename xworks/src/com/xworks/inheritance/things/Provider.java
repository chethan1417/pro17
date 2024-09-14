package com.xworks.inheritance.things;

public abstract class Provider {

	private String name;
	private String ceoName;

	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
	}

	public abstract void service();

	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("created equals in Provider ");
		if (obj != null) {

			if (obj instanceof Provider) {

				Provider casted = (Provider) obj;

				if (this.name.equals(casted.name) && this.ceoName.equals(casted.ceoName)) {
					System.out.println("contents of this and obj are equal");
					return true;
				} else {
					System.out.println("contents of this and obj are not equal");
				}

			} else {
				System.out.println("obj is null");
			}
		}
		return super.equals(obj);
	}
}
