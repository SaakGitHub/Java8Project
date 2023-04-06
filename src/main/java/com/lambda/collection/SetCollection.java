package com.lambda.collection;

import java.util.HashSet;
/*
 * In Set
 * Insertion Order Not Preserve
 * Duplicates Are Not Allowed
 * 
 */
public class SetCollection {
	public static void main(String[] args) {
		HashSet<String> s  =new HashSet<>();
		s.add("Saakib");
		s.add("Saima");
		s.add("Laiba");
		s.add("Saakib");
		
		System.out.println(s);
	}
}
