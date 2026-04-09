package org.example.session5.model;

public class Product {
    private  int id;
    private String name;
    private double price;
    private int stock;
    private boolean status;

    public Product(){};

    public Product(int id, String name, double price, boolean status, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", status=" + status +
                '}';
    }
}
