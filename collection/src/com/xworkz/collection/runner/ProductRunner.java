package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {

		ProductDTO productDTO1 = new ProductDTO(1, "Bottle", "osama", 99);
		ProductDTO productDTO2 = new ProductDTO(2, "Tyre", "kiran", 3000);
		ProductDTO productDTO3 = new ProductDTO(3, "Chair", "likith", 500);
		ProductDTO productDTO4 = new ProductDTO(4, "Tv", "alok", 25500);
		ProductDTO productDTO5 = new ProductDTO(5, "Shoe", "yash", 3499);
		ProductDTO productDTO6 = new ProductDTO(6, "Knief", "darshan", 199);
		ProductDTO productDTO7 = new ProductDTO(7, "Bag", "chandan", 1000);
		ProductDTO productDTO8 = new ProductDTO(8, "Watch", "akhil", 3599);
		ProductDTO productDTO9 = new ProductDTO(9, "Shirt", "goutham", 400);
		ProductDTO productDTO10 = new ProductDTO(10, "Gold", "sarthak", 70000);

		Collection<ProductDTO> collection = new LinkedList<ProductDTO>();

		collection.add(productDTO1);
		collection.add(productDTO2);
		collection.add(productDTO3);
		collection.add(productDTO4);
		collection.add(productDTO5);
		collection.add(productDTO6);
		collection.add(productDTO7);
		collection.add(productDTO8);
		collection.add(productDTO9);
		collection.add(productDTO10);

		System.out.println("original Data");
		collection.stream().forEach((ref) -> System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.sorted()
		.filter(ref->ref.getCost()>1000)
		.collect(Collectors.toList())
		.forEach(ref -> System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.sorted()
		.filter(ref->ref.getCost()>5000)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.sorted()
		.filter(ref->ref.getCost()>5000 && ref.getCost()<30000)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		
		collection
		.stream()
		.sorted((ref1,ref2)->Double.compare(ref2.getCost(),ref1.getCost()))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.sorted()
		.filter(ref->ref.getVendor().startsWith("a"))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		
		collection
		.stream()
		.sorted(Comparator.comparingDouble(ProductDTO::getCost))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		
		collection
		.stream()
		.sorted(Comparator.comparingInt(ProductDTO::getId))
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		
		collection
		.stream()
		.map(ProductDTO::getName)
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		System.out.println();
		
		collection
		.stream()
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getId()));
		System.out.println();
		
		collection
		.stream()
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref.getName().toUpperCase()));
		System.out.println();

	}

}
