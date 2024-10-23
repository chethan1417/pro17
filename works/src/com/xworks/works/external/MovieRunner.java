package com.xworks.works.external;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collector;

public class MovieRunner {

	public static void main(String[] args) {

		
	MoviesDTO moviesDTO1 = new MoviesDTO(1, "appu", 4.9, "puneeth Rajkumar");
	MoviesDTO moviesDTO2 = new MoviesDTO(1, "abhay", 4.5, "darshan");
	MoviesDTO moviesDTO3 = new MoviesDTO(1, "ranna", 4.7, "sudeep");

	Collection<MoviesDTO> collection=new LinkedList<MoviesDTO>();
	collection.add(moviesDTO1);
	collection.add(moviesDTO2);
	collection.add(moviesDTO3);
	
	collection.stream()
	.sorted((ref1,ref2)->ref1.getMovieName().compareTo(ref2.getMovieName()))
	.forEach(ref->System.out.println(ref));

	collection.stream()
	.sorted((ref1,ref2)->ref2.getMovieName().compareTo(ref2.getMovieName()))
	.forEach(ref->System.out.println(ref));

	collection.stream()
	.sorted()
	.forEach(ref->System.out.println(ref.getMovieName()));



	}

}
