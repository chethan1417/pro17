package com.xworkz.collection.dto;

import java.io.Serializable;

public class HRDTO implements Serializable {

	
	private String name;
	private String qualification;
	private int totalExp;
	private String location;
	
	public HRDTO() {

	}

	public HRDTO(String name, String qualification, int totalExp, String location) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.totalExp = totalExp;
		this.location = location;
	}

	@Override
	public String toString() {
		return "HRDTO [name=" + name + ", qualification=" + qualification + ", totalExp=" + totalExp + ", location="
				+ location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + totalExp;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HRDTO other = (HRDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (totalExp != other.totalExp)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
