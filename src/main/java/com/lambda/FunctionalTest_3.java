package com.lambda;
/*
 * Normal Impl 
interface Interf3{
	public int getLength(String s);
}

class Test3 implements Interf3{
	public int getLength(String s)
	{
		return s.length();
	}
}

public class FunctionalTest_3 {

	public static void main(String[] args) {
		Interf3 i = new Test3();
		System.out.println(i.getLength("Saakib"));

	}

}*/


interface Interf3{
		public int getLength(String s);
}
class FunctionalTest_3 {
	public static void main(String[] args) {
		Interf3 i = s -> s.length();
		System.out.println(i.getLength("Saakib"));
	}
}