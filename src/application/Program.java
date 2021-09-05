package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Phone", 1500.0));
		
		for ( Product p : set ) {
		  System.out.println(p);
			
		
		
		
	}

	}
}