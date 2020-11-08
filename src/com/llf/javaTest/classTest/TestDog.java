package com.llf.javaTest.classTest;

class Animal {
	public void move() {
		System.out.println("animal move");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("dog move");
	}
	
	public void bark() {
		System.out.println("dog bark");
	}
}

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal();
//		Animal b = new Dog();
//		
//		a.move();
//		b.move();
//		b.bark();
		
		System.out.println("TestDog");

	}

}
