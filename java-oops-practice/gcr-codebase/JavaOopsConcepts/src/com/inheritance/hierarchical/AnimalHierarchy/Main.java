package com.inheritance.hierarchical.AnimalHierarchy;

public class Main {
	public static void main(String[] args) {
		
		// Creating object of class
		Animal a = new Animal();
		a.makeSound();
		
		Bird b = new Bird();
		b.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
		
		// Method overriding
		Animal e = new Bird();
		e.makeSound();
	}
}
