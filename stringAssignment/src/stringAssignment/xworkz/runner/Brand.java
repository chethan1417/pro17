package stringAssignment.xworkz.runner;

public class Brand {
	
	private String brand;
	
	public Brand(String brand) {
		
		this.brand=brand;
	}
	
	@Override
	public int hashCode() {
		return 7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}
	
	

}
