package com.ibm.shop;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> items; //product type array =5
	private double total;
	
	   public ShoppingCart() {
		items = new ArrayList<>();
	}
	   
	   public void addItem(Product p) {
		   items.add(p);
		  total += p.getPrice();
		   System.out.println(p.getName() + " added to cart");
		   
	   }
	
	   public void checkout() {
		System.out.println("Your Shopping Cart");
		for(Product p : items)
			p.description();
		System.out.println("Cart Total: "+ total);
	}

}
