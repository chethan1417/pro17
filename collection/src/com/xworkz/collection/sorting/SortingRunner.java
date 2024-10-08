package com.xworkz.collection.sorting;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.sun.javafx.collections.SortableList;
import com.xworkz.collection.dto.CountryDTO;

public class SortingRunner {

	public static void main(String[] args) {

		Collection<Long> collection = new LinkedList<Long>();
		
		collection.add(998L);
		collection.add(12L);
		collection.add(17L);
		collection.add(148L);
		collection.add(2002L);
		collection.add(1L);
		collection.add(878L);
		collection.add(667L);
		collection.add(6755L);
		collection.add(8877L);
		collection.add(101L);
		
		
		System.out.println("Before Sorting");
		collection
		.stream()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("After Sorting , in increasing order");
		collection
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("After Sorting , in decreasing order");
		collection
		.stream()
		.sorted((ref1,ref2)->ref2.compareTo(ref1))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		Collection<String> collection1 = new LinkedList<String>();

		collection1.add("Jawaharlal Nehru");
		collection1.add("Gulzarilal Nanda");
		collection1.add("Lal Bahadur Shastri ");
		collection1.add("Indira Gandhi");
		collection1.add("Morarji Desai");
		collection1.add("Charan Singh");
		collection1.add("Rajiv Gandhi");
		collection1.add("Vishwanath Pratap Singh");
		collection1.add("Chandra Shekar");
		collection1.add("P.V Narasimha Roa");
		collection1.add("Atal Bihari Vajpayee");
		collection1.add("Manmohan Singh");
		collection1.add("Narendra Modi");
		
		
		System.out.println("Before Sorting");
		collection1
		.stream()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("After Sorting , in ascending order");
		collection1
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("After Sorting, in decending order");
		collection1
		.stream()
		.sorted((ref1,ref2)->ref2.compareTo(ref1))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		Collection<String> collection2=new LinkedList<String>();
		
		collection2.add("Karnataka");
		collection2.add("Goa");
		collection2.add("Andra Pradesh");
		collection2.add("Tamil Nadu ");
		collection2.add("Arunachal Pradesh");
		collection2.add("Assam");
		collection2.add("Bihar");
		collection2.add("Chhattisgarh");
		collection2.add("Gujarat");
		collection2.add("Haryana");
		collection2.add("Himachar Pradesh");
		collection2.add("Jharkhand");
		collection2.add("Kerala");
		collection2.add("West Bengal");		
		collection2.add("Uttarakhand");
		collection2.add("Uttar Pradesh");
		collection2.add("Tripura");
		collection2.add("Telangana");
		collection2.add("Sikkim");
		collection2.add("Rajastan");
		collection2.add("Punjab");
		collection2.add("Odisha");
		collection2.add("Nagaland");
		collection2.add("Mizoram");
		collection2.add("Meghalaya");
		collection2.add("Manipur");
		collection2.add("Maharastra");
		collection2.add("Madhya  Pradesh");
		
		System.out.println("Before Sorting");
		collection2
		.stream()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("After Sorting ,in increasing order");
		collection2
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("after Sorting, in decreasing order");
		collection2
		.stream()
		.sorted((ref1,ref2)->ref2.compareTo(ref1))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		System.out.println();
	}

}
