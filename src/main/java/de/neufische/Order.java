package de.neufische;

import java.util.Objects;

public class Order {

    private String id;
    private OrderStatus Orderstatus;

    public Order() {
    }

    public Order(String id, OrderStatus orderstatus) {
        this.id = id;
        Orderstatus = orderstatus;
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        Orderstatus = orderstatus;
    }

    public OrderStatus getOrderstatus() {
        return Orderstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Orderstatus == order.Orderstatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Orderstatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", Orderstatus=" + Orderstatus +
                '}';
    }
}
