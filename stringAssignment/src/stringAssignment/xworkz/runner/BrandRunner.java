package stringAssignment.xworkz.runner;

public class BrandRunner {

	public static void main(String[] args) {

		Brand brand1=new Brand("Kawasaki");
		System.out.println(brand1.hashCode());
		
		Brand brand2=new Brand("Kawasaki");
		System.out.println(brand2.hashCode());
		
		boolean compare=brand1.equals(brand2);
		System.out.println(compare);
		
		if(brand1==brand2)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	}

}
