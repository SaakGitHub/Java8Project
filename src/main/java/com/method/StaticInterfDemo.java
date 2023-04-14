package com.method;

interface Interf{
	static void m1(){
		System.out.println("sttaic interf method");
	}
}

public class StaticInterfDemo implements Interf {

	public static void main(String[] args) {
		StaticInterfDemo s = new StaticInterfDemo();
		//m1();
		//s.m1();
		//StaticInterfDemo.m1();
		
		/*
		 * We can call interface static method inside 
		 * a implementation class only by Interface name as below.
		 * 
		 **/ 
		Interf.m1();

	}

}
