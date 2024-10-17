package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.MallDTO;
import com.xworkz.collection.dto.MatchBoxDTO;
import com.xworkz.collection.dto.ProductDTO;
import com.xworkz.collection.eNum.Location;

public class MallRunner {

	public static void main(String[] args) {

		MallDTO mallDTO1=new MallDTO(1, "Gt Mall", Location.MAGADI_ROAD, "Chandan", 298678);
		MallDTO mallDTO2=new MallDTO(2, "Lulu Mall", Location.RAJAJINGAR, "Varun", 80789);
		MallDTO mallDTO3=new MallDTO(3, "Gopalan Mall", Location.RR_NAGAR, "Alok", 55677);
		MallDTO mallDTO4=new MallDTO(4, "Forum South", Location.KONANAKUNTE , "Akhil",199876);
		MallDTO mallDTO5=new MallDTO(5, "Orion Mall", Location.YESHWANTHPUR, "Likhi", 66987);
		MallDTO mallDTO6=new MallDTO(6, "Om Mall", Location.MAGADI_ROAD, "Goutham", 9897665);
		MallDTO mallDTO7=new MallDTO(7, "RR Mall", Location.RR_NAGAR, "Sanjan", 199876);
		MallDTO mallDTO8=new MallDTO(8, "Bash Mall", Location.MAGADI_ROAD, "Siddu",544345);
		MallDTO mallDTO9=new MallDTO(9, "Gopalan south Mall", Location.KONANAKUNTE, "Sujay", 123234);
		MallDTO mallDTO10=new MallDTO(10, "KR Mall", Location.RAJAJINGAR, "Bhuvan", 789678);

		Collection<MallDTO> collection = new LinkedList<MallDTO>();
		
		collection.add(mallDTO1);
		collection.add(mallDTO2);
		collection.add(mallDTO3);
		collection.add(mallDTO4);
		collection.add(mallDTO5);
		collection.add(mallDTO6);
		collection.add(mallDTO7);
		collection.add(mallDTO8);
		collection.add(mallDTO9);
		collection.add(mallDTO10);
		
		System.out.println("Original Data");
		System.out.println();
		collection
		.stream()
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		System.out.println("Dec order by Id");
		collection
		.stream()
		.sorted((ref1,ref2)->Integer.compare(ref2.getId(),ref1.getId()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		System.out.println("LandDimention less than lakh");
		collection
		.stream()
		.filter(ref->ref.getLandDimention()<100000)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		System.out.println("printing only mall names");
		collection
		.stream()
		.map(ref->ref.getName())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
				
		System.out.println("collecting only LandDimention in asc order");
		collection
		.stream()
		.sorted((ref1,ref2)->Double.compare(ref1.getLandDimention(),ref2.getLandDimention()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getLandDimention()));
		System.out.println();
		

		Iterator<MallDTO> iterator = collection.iterator();

		System.out.println("iterator");
		while (iterator.hasNext()) {
			MallDTO ref = iterator.next();
			System.out.println(ref);
		}
		
		LinkedList<MallDTO> collection1=new LinkedList<MallDTO>();
		
		ListIterator<MallDTO> listIterator=collection1.listIterator();
		
		System.out.println("listTterator");
		
		while (listIterator.hasNext()) {
			MallDTO ref = listIterator.next();
			System.out.println(ref);
		}

	}

}
