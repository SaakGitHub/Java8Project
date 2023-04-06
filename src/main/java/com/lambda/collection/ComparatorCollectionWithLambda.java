package com.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorCollectionWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		l.add(5);

		System.out.println("Before Sorting : " + l);
		Collections.sort(l);
		System.out.println("Default Sorting Order : " + l);
		Collections.sort(l, (o1,o2)-> (o1>o1)?-1:(o1<o2)?1:0);
		System.out.println("Customized Sorting Order : " + l);
	}

}
