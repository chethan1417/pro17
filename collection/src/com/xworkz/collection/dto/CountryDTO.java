package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.eNum.Code;
import com.xworkz.collection.eNum.Continent;

public class CountryDTO implements Serializable {

	private String name;
	private Code code;
	private long population;
	private String presidentName;
	private Continent continent;

	public CountryDTO() {
	}

	public CountryDTO(String name, Code code, long population, String presidentName, Continent continent) {
		super();
		this.name = name;
		this.code = code;
		this.population = population;
		this.presidentName = presidentName;
		this.continent = continent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (code != other.code)
			return false;
		if (continent != other.continent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", code=" + code + ", population=" + population + ", presidentName="
				+ presidentName + ", continent=" + continent + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
