package com.capgemini.corejava;

public class Inheritance {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int valueInParentClass=12;
		
		ChildClass childClass=new ChildClass();
		System.out.println(valueInParentClass);
	//	System.out.println(childClass.valueInParentClass);
		childClass.parentMethod();	
		
		//System.out.println(childClass.parentMethod());
		Inheritance Inheritance=new Inheritance();
		Inheritance.parentMethod();
		
	}
	 void parentMethod(){
		int valueInParentMethod=13;
		System.out.println(valueInParentMethod);

	}

}



class ChildClass extends Inheritance{	
	
	void parentMethod(){
		//int valueInParentMethod;
		//valueInParentMethod=valueInParentMethod+23;
		System.out.println("im in child class");
		
	}
	void childClassMethod(){
			
		
		super.parentMethod();
	}

	
}
