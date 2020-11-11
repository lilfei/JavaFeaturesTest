package com.llf.thinking_in_java.c15_type_info;

import java.util.ArrayList;
import java.util.Random;

class Product {
	private final int id;
	private String desc;
	private double price;

	public Product(int id, String desc, double price) {
		this.id = id;
		this.desc = desc;
		this.price = price;
	}

	public void priceChange(double change) {
		price += change;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", desc=" + desc + ", price=" + price + "]";
	}

	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random(48);

		public Product next() {
			return new Product(
			        rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000.0) + 0.99);
		}
	};
}

class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProducts) {
		for (int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}

class CheckoutStand {

}

class Office {

}

public class Store extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();

	public Store(int nAisles, int nShelves, int nProducts) {
		for (int i = 0; i < nAisles; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Aisle a : this) {
			for (Shelf s : a) {
				for (Product p : s) {
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(new Store(1, 2, 3));
	}

}
