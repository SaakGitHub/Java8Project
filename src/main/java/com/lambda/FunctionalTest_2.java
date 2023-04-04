package com.lambda;
/*
 *Normal Impl 
 *
interface Interf2
{
	public void m1(int a, int b);
}

class Test2 implements Interf2
{
	public void  m1(int a, int b) {
		System.out.println("Normal impl reslt :"+(a+b));
	}
}

public class FunctionalTest_2 {

	public static void main(String[] args) {
		Interf2 i = new Test2();
		i.m1(10, 20);
		i.m1(100, 200);
	}

}
*/

interface Interf2
{
 public void sum(int a,int b);	
}

public class FunctionalTest_2 {

	public static void main(String[] args) {
		Interf2 i = (a,b) -> System.out.println("Lambda Imple sum :"+(a+b));
		i.sum(10, 20);
		i.sum(100, 200);
	}

}