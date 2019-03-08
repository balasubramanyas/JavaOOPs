/**
 * @author Balasubramanya S
 */
package com.balasubramanya.oops.association;

import java.util.List;

public class Animal {
	
	private Heart heart = null;
	
	private List<AnimalChild> animalChildren = null;
	
	public List<AnimalChild> getAnimalChildren() {
		return animalChildren;
	}
	
	public Heart getHeart() {
		return heart;
	}

	public void setAnimalChildren(List<AnimalChild> animalChildren) {
		this.animalChildren = animalChildren;
	}

	public Animal(Heart heart) {
		this.heart = heart;
	}

}
