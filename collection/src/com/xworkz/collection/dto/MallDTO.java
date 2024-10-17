package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.eNum.Location;

public class MallDTO implements Serializable{
	
	private int id;
	private String name;
	private Location location;
	private String owner;
	private double landDimention;
	
	public MallDTO() {
	}

	public MallDTO(int id, String name, Location location, String owner, double landDimention) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.landDimention = landDimention;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(landDimention);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		MallDTO other = (MallDTO) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(landDimention) != Double.doubleToLongBits(other.landDimention))
			return false;
		if (location != other.location)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MallDTO [id=" + id + ", name=" + name + ", location=" + location + ", owner=" + owner
				+ ", landDimention=" + landDimention + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getLandDimention() {
		return landDimention;
	}

	public void setLandDimention(double landDimention) {
		this.landDimention = landDimention;
	}
	
	

}
