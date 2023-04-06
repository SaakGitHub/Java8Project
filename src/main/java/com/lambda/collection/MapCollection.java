package com.lambda.collection;

import java.util.HashMap;

/*
 * In Map(Key-Value Pairs)
 * Insertion Order Not Preserve
 * Duplicate Keys Are Not Allowed
 * 
 */
public class MapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "Sakib");
		m.put(2, "Saima");
		m.put(3, "Laiba");
		m.put(4, "Saima");
		m.put(3, "Coming Soonn");
		
		System.out.println(m);

	}

}
