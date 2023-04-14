package com.method;

interface Interf1{
	
	default void m1(){
		System.out.println("Interf1 interface default method");
	}
}

interface Interf2{
	
	default void m1(){
		System.out.println("Interf2 interface default method");
	}
}
public class DefaultInterfaceDemo implements Interf1, Interf2 {

	public static void main(String[] args) {
		
		DefaultInterfaceDemo d= new DefaultInterfaceDemo();
		//m1();
		d.m1();
	}

	@Override
	public void m1() {
		
		Interf2.super.m1();
	}

}
