package com.honnappa.Streams;

public class Iteams {
    private String name;
    private String price;
    private String inStock;
    private String onSale;


    public Iteams(String name, String price, String inStock, String onSale) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Iteams{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", inStock='" + inStock + '\'' +
                ", onSale='" + onSale + '\'' +
                '}';
    }
}
