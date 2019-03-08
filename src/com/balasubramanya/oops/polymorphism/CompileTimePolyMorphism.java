/**
 * @author Balasubramanya S
 */
package com.balasubramanya.oops.polymorphism;

public class CompileTimePolyMorphism {

	public static void main(String[] args) {
		/*
		 * 1. Methods Name should be same
		 * 2. If Number of passing arguments are same,
		 * 		 then their datatype or position should be different 
		 * 3. Return datatype can be anything.
		 */
		
		CompileTimePolyMorphism compileTimePolyMorphism = new CompileTimePolyMorphism();
		compileTimePolyMorphism.display("Balasubramanya");
		compileTimePolyMorphism.display(1234567890);
		compileTimePolyMorphism.display("Balasubramanya", 1234567890);
	}
	
	
	
	public void display(String name) {
		
		System.out.println("Hey I'm " + name);
	}
	
	public void display(long contactNumber) {
		
		System.out.println("My Contact Number " + contactNumber);
	}
		
	public void display(String name, long contactNumber) {
		
		System.out.println("Hey I'm " + name + ", My Contact Number " + contactNumber);
	}

}
