package com.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		/*if(o1>o2)
			return -1;
		else if(o1<o2)
			return 1;
		else 
			return 0;*/
		
		return (o1>o2)?-1:(o1<o2)?1:0;
	}
}

public class ComparatorCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(20);
		l.add(15);
		l.add(5);

		System.out.println("Before Sorting : "+l);
		Collections.sort(l);
		System.out.println("Default Sorting Order : "+l);
		Collections.sort(l, new MyComparator());
		System.out.println("Customized Sorting Order : "+l);
	}

}
