package com.example;

public class ECommerceSystem {
public static void main(String[] args) {
    Product product1 = new Product(1,"Laptop",50000);
    Product product2 = new Product(2,"Phone",20000);


    User user = new User(1,"Ashish",9);
    Product[] orderproducts = {product1,product2};
    user.placeOrder(orderproducts);

    Product[] orderproducts2 = {product2};
    user.placeOrder(orderproducts2);
    System.out.println("--------------ORDERS-----------:");
    user.viewOrder();
}
}