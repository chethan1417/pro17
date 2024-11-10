package stringAssignment.xworkz.runner;

public class MethodsRunner {

	public static void main(String[] args) {

		String string="Bengaluru is the silicon city of India";
		
		System.out.println(string.length());
		System.out.println(string.charAt(4));
		System.out.println(string.subSequence(17,24));
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.trim());
		System.out.println(string.replace("silicon","Silicon"));
		System.out.println(string.indexOf("city"));
		System.out.println(string.lastIndexOf('e'));
		System.out.println(string.contains(string));
		System.out.println(string.startsWith("I"));
		System.out.println(string.endsWith("n"));
		System.out.println(string.valueOf(string));
		System.out.println(string.isEmpty());
		System.out.println(string.compareTo(string));
		System.out.println(string.compareToIgnoreCase(string));


		
	}

}
