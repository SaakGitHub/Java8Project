package com.lambda;
@FunctionalInterface
public interface Parent {
 public void m1();
}
@FunctionalInterface
interface Child extends Parent
{
	//public void m2();
}
