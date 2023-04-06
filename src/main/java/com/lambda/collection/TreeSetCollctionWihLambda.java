package com.lambda.collection;

import java.util.TreeSet;

public class TreeSetCollctionWihLambda {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<02)?1:0);
		
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(15);
		t.add(20);
		
		System.out.println(t);

	}

}
