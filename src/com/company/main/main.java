package com.company.main;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Animal;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		Animal dog = new Animal("Paco", 3);
		
		animals[0] = dog;
	
		Animal cat = new Animal("Amelia", 4);
		
		animals[1] = cat;
		
		Animal nonAdoptedAnimal = new Animal();
		
		animals[2] = nonAdoptedAnimal;
		
		nonAdoptedAnimal.setName("Pancracio");
		nonAdoptedAnimal.setAge(1);
		
		for(int i = 0 ; i < animals.length ; i++) {
			Animal auxAnimal = animals[i];
			System.out.println(auxAnimal);
		}
		
		for(Animal auxAnimal : animals) {
			System.out.println(auxAnimal.getName() + " " + auxAnimal.getAge());
		}
		
		System.out.println(animals);
		
		
		
	}
}
