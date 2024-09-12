package com.xworks.practice.assign;

public class PersonRunner {

	public static void main(String[] args) {

		Person[] persons = new Person[5];

		persons[0] = new Person("chethan", "chethan@gmail.com", 22, 8548866698L);
		persons[1] = new Person("varun", "varun@gmail.com", 21, 9380284219L);
		persons[2] = new Person("naganna", "naganna@gmail.com", 24, 9793727798L);
		persons[3] = new Person("likhi", "likhi@gmail.com", 22, 7895671234L);
		persons[4] = new Person("akhil", "akhil@gmail.com", 23, 8768762335L);

		for (Person person : persons) {
			person.display();
		}

	}
}
