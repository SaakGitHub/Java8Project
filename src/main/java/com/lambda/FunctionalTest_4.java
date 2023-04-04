package com.lambda;
/* Normal ipl
interface Interf4{
	public int sqrt(int a);
}

class Test4 implements Interf4{
	public int  sqrt(int a) {
		return a*a;
	}
}

public class FunctionalTest_4 {

	public static void main(String[] args) {
		Interf4 i = new Test4();
		System.out.println(i.sqrt(4));
		System.out.println(i.sqrt(16));
	}

}

*/

interface Interf4{
	public int sqrt(int a);
}
public class FunctionalTest_4 {

	public static void main(String[] args) {
		Interf4 i = a -> a*a;
		System.out.println(i.sqrt(2));
		System.out.println(i.sqrt(16));
	}

}