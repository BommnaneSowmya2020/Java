package com.ibm.shop;

public class Product {
 private int code;
 private String name;
 private double price;
 private int stock;
 private static int codegen =101;
 
 public Product() {
	
}
public Product(String name, double price) {
	this.code = codegen ++;
	this.name = name;
	this.price = price;
	this.stock = 10;
}

public void description() {
	System.out.println("Product[" + code + "," +name+ "," +price + "," +stock + "]");
}
 
public double getPrice() {
	return price;
}


public String getName() {
	return name;
}
public int getStock() {
	return stock;
}

}
