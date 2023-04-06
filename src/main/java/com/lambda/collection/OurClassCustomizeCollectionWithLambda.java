package com.lambda.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int no;
	String name;
	
	public Employee(int no,String name) {
		this.no = no;
		this.name=name;
	}
	public String toString() {
		return no+" : "+name;
	}
}

public class OurClassCustomizeCollectionWithLambda {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(100, "Junny"));
		l.add(new Employee(300, "Tunny"));
		l.add(new Employee(200, "Lunny"));
		l.add(new Employee(500, "Munny"));
		l.add(new Employee(600, "Chunny"));
		l.add(new Employee(400, "Bunny"));
		
		System.out.println("Before Sort : "+l);
		Collections.sort(l, (e1,e2)->(e1.no<e2.no)?-1:(e1.no>e2.no)?1:0);
		System.out.println("After Sort : "+l);
		
	}

}
