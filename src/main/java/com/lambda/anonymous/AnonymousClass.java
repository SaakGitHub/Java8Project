package com.lambda.anonymous;

interface AnonymousInterf{
	public void m1();
}

/*public class AnonymousClass {

	int x = 888;
	
	public void m2(){
		AnonymousInterf i = new AnonymousInterf() {
			int x =999;
			public void m1() {
				System.out.println(this.x);
				System.out.println(AnonymousClass.this.x);
			}
		};
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousClass a =new AnonymousClass();
		a.m2();

	}

}*/

public class AnonymousClass {

	int x = 888;
	
	public void m2(){
		AnonymousInterf i = () -> {
				int x =999;
				System.out.println(this.x);
				System.out.println(AnonymousClass.this.x);
			
		};
		i.m1();
	}
	public static void main(String[] args) {
		AnonymousClass a =new AnonymousClass();
		a.m2();

	}

}
