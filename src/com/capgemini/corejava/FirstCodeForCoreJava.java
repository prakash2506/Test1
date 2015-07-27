package com.capgemini.corejava;

public class FirstCodeForCoreJava
{
	void sum(int i,int j){
		System.out.println(i+j);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		FirstCodeForCoreJava firstCodeForCoreJava=new FirstCodeForCoreJava();
		firstCodeForCoreJava.sum(5, 7);
		TestClass testClass=new TestClass();
		testClass.sum(10, 7);
		SecondCodeForCoreJava secondCodeForCoreJava=new SecondCodeForCoreJava();
		secondCodeForCoreJava.multiplyMethod(10, 7);	
		ReturnValueTesting returnValueTesting=new ReturnValueTesting();
		int s=returnValueTesting.Substract(10, 6);
		System.out.println(s);
		
		
				
	}

}

 class SecondCodeForCoreJava {
	void multiplyMethod(int i,int j){
		System.out.println(i*j);
	}
}
 
 
 class ReturnValueTesting{
	 int Substract(int h,int k){
		 int d=h-k;
		 return d;
	 }
 }


