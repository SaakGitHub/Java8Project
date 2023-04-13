package com.lambda.anonymous;

interface AnonymousInterf1{
	public void m1();
}


public class AnonymousClassWithLambda {

	int x = 888;
	
	public void m2(){
		AnonymousInterf i = () -> {
				int x =999;
				System.out.println(this.x);

		};
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousClass a =new AnonymousClass();
		a.m2();

	}

}