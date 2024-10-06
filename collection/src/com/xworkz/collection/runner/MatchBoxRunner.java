package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {

		MatchBoxDTO matchBoxDTO1 = new MatchBoxDTO(5, "ABC");
		MatchBoxDTO matchBoxDTO2 = new MatchBoxDTO(10, "XYZ");
		MatchBoxDTO matchBoxDTO3 = new MatchBoxDTO(15, "MAN");
		MatchBoxDTO matchBoxDTO4 = new MatchBoxDTO(20, "DEF");
		MatchBoxDTO matchBoxDTO5 = new MatchBoxDTO(25, "GHI");

		Collection<MatchBoxDTO> collection = new LinkedList<MatchBoxDTO>();

		collection.add(matchBoxDTO1);
		collection.add(matchBoxDTO2);
		collection.add(matchBoxDTO3);
		collection.add(matchBoxDTO4);
		collection.add(matchBoxDTO5);

		System.out.println("Before clearing");
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());
		System.out.println();

		Iterator<MatchBoxDTO> iterator = collection.iterator();

		while (iterator.hasNext()) {
			MatchBoxDTO ref = iterator.next();
			System.out.println(ref);
		}

	}

}
