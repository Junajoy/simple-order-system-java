package com.example;
//Order Class
//Purpose: Represents a customer's order, which may include multiple products.
//
//Fields:
//
//int orderId
//Product[] products
//double totalAmount
//Methods:
//
//Order(int orderId, Product[] products)
//double calculateTotal()
//void displayOrderDetails()
//
//public class Order {
//    int orderId;
//    Product[] products;
//    double totalAmount;
//
//    public Order(int orderId, Product[] products, double totalAmount) {
//        this.orderId = orderId;
//        this.products = products;
//        this.totalAmount = totalAmount;
//    }
//
//    public Order(Product[] products) {
//    }
//
//    public double calculateTotal() {
//        double total = 0;
//        for (Product p : products) {
//            total += p.getPrice();
//        }
//        return total;
//    }
//
//    public void displayOrderDetails() {
//        System.out.println("Order ID: " + orderId);
//        for (Product p : products) {
//            p.displayProductDetails();
//        }
//        System.out.println("    Total Amount: " + totalAmount);
//    }
//
//}


public class Order {
    private int orderId;
    private Product[] products;
    double totalAmount;


    public Order(Product[] products) {
        this.products = products;
        //this.orderId++;
        calculateTotal();
    }

    public Order(int orderId, Product[] products) {
        this.orderId = orderId;
        this.products = products;
    }


    double calculateTotal(){
        for(Product i : products){
            totalAmount += i.getPrice();
        }
        return totalAmount;
    }

    void displayOrderDetails() {
        System.out.println("Order Id: " + orderId);
        System.out.println("Product List: ");
        for(Product p : products)
            System.out.println(p.getName() +" "+ p.getPrice());
        System.out.println("Total Amount: " + totalAmount);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}