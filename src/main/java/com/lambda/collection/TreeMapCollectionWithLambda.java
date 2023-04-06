package com.lambda.collection;

import java.util.TreeMap;

public class TreeMapCollectionWithLambda {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m = new TreeMap<Integer,String>((o1,o2)->(o1>o2)?-1:(o1<02)?1:0);
		
		m.put(100,"Saakib");
		m.put(200,"Saima");
		m.put(600,"Laiba");
		m.put(400,"aaki");
		m.put(300,"Saabir");
		m.put(500,"Laib");
		
		System.out.println(m);

	}

}
