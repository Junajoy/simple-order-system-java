package com.example;


//Classes and Responsibilities
//1. Product Class
//Purpose: Represents a single product in the e-commerce system.
//
//Fields:
//
//int productId: Unique ID of the product.
//String name: Name of the product.
//double price: Price of the product.
//Methods:
//
//Product(int productId, String name, double price): Constructor to initialize product.
//void displayProductDetails(): Prints product details.



public class Product {

    int productId;
    String name;
    double price;


    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayProductDetails(){
        System.out.println("productId:"+productId+" name:"+name+"price:"+price);

    }
}
