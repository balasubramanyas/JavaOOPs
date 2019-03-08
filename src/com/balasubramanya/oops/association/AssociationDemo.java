/**
 * @author Balasubramanya S
 */
package com.balasubramanya.oops.association;

import java.util.ArrayList;
import java.util.List;

public class AssociationDemo {
	
	public void main(String[] args) {
		
		/**
		 * One to One
		 * One Animal Have only One Heart
		 */
		Heart heart = new Heart();
		heart.setHeartName("Animal Heart");
		
		Animal animal = new Animal(heart);
		/**
		 * One to Many
		 * One Animal can have many Child
		 * 
		 */
		List<AnimalChild> animalChildren = new ArrayList<AnimalChild>();
		animalChildren.add(new AnimalChild("ABC"));
		animalChildren.add(new AnimalChild("DEF"));
		animalChildren.add(new AnimalChild("GHI"));
		
		animal.setAnimalChildren(animalChildren);
		
	}

}
