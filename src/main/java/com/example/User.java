package com.example;

public class User {
    private int userId;
    private String name;
    private Order[] orders;
    private int orderCount;


    public User(int userId, String name, int maxOrders) {
        this.userId = userId;
        this.name = name;
        orders = new Order[maxOrders];
        orderCount = 0;
    }
    int oid=1;


   public void placeOrder(Product[] products) {

        if(orderCount < orders.length) {

            Order order = new Order(oid++,products);
           // order.setOrderId(order.getOrderId()+1);
            orders[orderCount++] = order;
            System.out.println("Order placed!");
            order.displayOrderDetails();
        } else {
            System.out.println("Order limit");
        }
    }

    void viewOrder() {
        if(orderCount == 0)
            System.out.println("No orders yet");

        System.out.println("User Id: " + userId +
                "\nName: " + name +
                "\nOrder count: " + orderCount);
        System.out.println("Orders: ");
        for(int i = 0; i < orderCount; i++) {
            orders[i].displayOrderDetails();
            System.out.println();
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}
