package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.HRDTO;
import com.xworkz.collection.dto.MallDTO;

public class HRDTORunner {

	public static void main(String[] args) {

		HRDTO hrDTO1=new HRDTO("likith","BE",2 ,"chitradurga");
		HRDTO hrDTO2=new HRDTO("Alok","Bcom",1 ,"davanagere");
		HRDTO hrDTO3=new HRDTO("akhil","MA",4,"shivamogga");
		HRDTO hrDTO4=new HRDTO("goutham","Mtech",6 ,"hubli");
		HRDTO hrDTO5=new HRDTO("sanjan","BE",8,"gadag");
		HRDTO hrDTO6=new HRDTO("kishor","Mcom",1 ,"dharwad");
		HRDTO hrDTO7=new HRDTO("devika","MA",0,"belgavi");
		HRDTO hrDTO8=new HRDTO("chethan","Mcom",1,"mysore");
		HRDTO hrDTO9=new HRDTO("yashu","Mtech",9,"bengaluru");
		HRDTO hrDTO10=new HRDTO("chandan","BE",2 ,"chitradurga");

		Collection<HRDTO> collection=new LinkedList<HRDTO>();
		collection.add(hrDTO1);
		collection.add(hrDTO2);
		collection.add(hrDTO3);
		collection.add(hrDTO4);
		collection.add(hrDTO5);
		collection.add(hrDTO6);
		collection.add(hrDTO7);
		collection.add(hrDTO8);
		collection.add(hrDTO9);
		collection.add(hrDTO10);
		
		collection
		.stream()
		.filter(ref->ref.getLocation().startsWith("c"))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();

		collection
		.stream()
		.filter(ref->ref.getTotalExp()>5)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();
		
		collection
		.stream()
		.filter(ref->ref.getName().endsWith("r"))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName()));
		System.out.println();
		
		collection
		.stream()
		.map(ref->ref.getLocation())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.map(ref->ref.getName())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		

		collection
		.stream()
		.sorted((ref1,ref2)->ref1.getName().compareTo(ref2.getName()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		collection
		.stream()
		.sorted((ref1,ref2)->ref1.getQualification().compareTo(ref2.getQualification()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		collection
		.stream()
		.sorted((ref1,ref2)->Integer.compare(ref2.getTotalExp(),ref1.getTotalExp()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();

		Iterator<HRDTO> iterator = collection.iterator();
		
		System.out.println("iterator");
		while (iterator.hasNext()) {
			HRDTO ref = iterator.next();
			if(ref.getName().startsWith("a"))
			System.out.println(ref);
		}

        LinkedList<HRDTO> collection1=(LinkedList<HRDTO>)collection;
		
		ListIterator<HRDTO> listIterator=collection1.listIterator(10);
		
		System.out.println("listTterator");
		
		while (listIterator.hasPrevious()) {
			HRDTO ref = listIterator.previous();
			System.out.println(ref);
		}
		
		
	}

}
