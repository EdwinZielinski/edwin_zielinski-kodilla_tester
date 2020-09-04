package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productname;
    private double quantity;

    public Order(String orderNumber, String productname, double quantity){
        this.orderNumber = orderNumber;
        this.productname = productname;
        this. quantity = quantity;
    }
    public String getOrderNumber(){
        return orderNumber;
    }
    public  String getProductname(){
        return productname;
    }
    public double getQuantity(){
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0 &&
                Objects.equals(orderNumber, order.orderNumber) &&
                Objects.equals(productname, order.productname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, productname, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productname='" + productname + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
