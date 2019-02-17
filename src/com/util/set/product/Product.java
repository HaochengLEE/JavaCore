package com.util.set.product;

/**
 * @author lihaocheng
 * @create 2019-02-17 9:32 PM
 **/

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
