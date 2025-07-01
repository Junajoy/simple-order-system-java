# Simple E-Commerce Order System in Java (Using Arrays)

## 🧾 Overview

This is a basic simulation of an **e-commerce order placement system** using **Java** with **Object-Oriented Programming (OOP)** principles. It models the interactions between `User`, `Product`, and `Order` using **arrays**, making it a beginner-friendly example to understand class relationships and data handling in Java.

---

## 🎯 Objectives

- Demonstrate core **OOP concepts**: encapsulation, object interaction, and class design.
- Implement a **fixed-size order management system** using arrays.
- Simulate **order placement and summary generation** without database or UI.
- Help beginners practice handling **arrays of objects** and basic class relationships.
- Provide a foundation that can be extended to real-world features like carts or user inputs.

---

## 📌 Expectations

By the end of this project, a learner is expected to:

- Understand how to create and use **multiple Java classes** that interact.
- Learn how to work with **arrays of objects** in Java.
- Be able to simulate **real-world logic** like placing and viewing orders.
- Know how to **compute aggregate data** (e.g., total order amount) from an object array.
- Practice displaying structured output using object methods like `displayOrderDetails()`.

---

## 📦 Classes and Responsibilities

### 1. `Product` Class

**Purpose**: Represents a single product in the e-commerce system.

**Fields**:

- `int productId`: Unique ID of the product.
- `String name`: Name of the product.
- `double price`: Price of the product.

**Methods**:

- `Product(int productId, String name, double price)`: Constructor to initialize product.
- `void displayProductDetails()`: Prints product details.

---

### 2. `Order` Class

**Purpose**: Represents a customer's order, which may include multiple products.

**Fields**:

- `int orderId`
- `Product[] products`
- `double totalAmount`

**Methods**:

- `Order(int orderId, Product[] products)`
- `double calculateTotal()`
- `void displayOrderDetails()`

---

### 3. `User` Class

**Purpose**: Represents a customer who can place multiple orders.

**Fields**:

- `int userId`
- `String name`
- `Order[] orders`
- `int orderCount`

**Methods**:

- `User(int userId, String name, int maxOrders)`
- `void placeOrder(Product[] products)`
- `void viewOrders()`

---

### 4. `ECommerceSystem` Class (Main)

**Purpose**: Main class to simulate system behavior:

- Create sample products
- Create a user
- Let the user place an order
- Display the order summary

---

## ✅ Expected Output

```
Order placed successfully!
Orders for Ashish:
Order ID: 1
    Product ID: 1, Name: Laptop, Price: 50000.0
    Product ID: 2, Name: Phone, Price: 20000.0
    Total Amount: 70000.0
```
