package com.example.orders.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String pizzasOrdered;
    private String orderNote;


    public Order() {
    }

    public Order(String pizzasOrdered, String orderNote) {
        this.pizzasOrdered = pizzasOrdered;
        this.orderNote = orderNote;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getPizzasOrdered() {
        return pizzasOrdered;
    }

    public void setPizzasOrdered(String pizzasOrdered) {
        this.pizzasOrdered = pizzasOrdered;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

}
