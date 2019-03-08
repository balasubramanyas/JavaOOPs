/**
 * @author Balasubramanya S
 */
package com.balasubramanya.oops.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		ParentClass parentClass = new ParentClass();
		parentClass.execute();
		
		ChildClass childClass = new ChildClass();
		childClass.execute();
		
		/*
		 * child is a reference type ParentClass and
		 * it refers to an object of reference type ChildClass 
		 */
		ParentClass child = childClass;
		child.execute();
		
	}

}
