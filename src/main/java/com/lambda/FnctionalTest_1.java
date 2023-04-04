package com.lambda;

/*
 * Normal Implementation
@FunctionalInterface
interface Interf1
{
	public void m1();
}

class Test1 implements Interf1
{
	@Override
	public void m1() {
		System.out.println("Normal Interf Implemnetation");
	}
}

public class FnctionalTest_1 {

	public static void main(String[] args) {
		Interf1 i = new Test1();
		i.m1();
	}

}*/

interface Interf1
{
	public void m1();
}

public class FnctionalTest_1 {
	public static void main(String[] args) {
		Interf1 i = () -> System.out.println("Lambda Implementation");
		i.m1();
	}
	
}

