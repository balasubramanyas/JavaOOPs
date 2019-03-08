package com.balasubramanya.oops.polymorphism;

public class RuntimePolyMorphismDemo {

	public static void main(String[] args) {
		Example1 runtimePolymorphism = new Example1();
		runtimePolymorphism.display();
		
		runtimePolymorphism = new Example2();
		runtimePolymorphism.display();

	}

}
