package com.workintech.productforsale;

import java.util.Objects;

public abstract class ProductForSale {

    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();


    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductForSale that = (ProductForSale) o;
        return Objects.equals(type, that.type);
    }


}
