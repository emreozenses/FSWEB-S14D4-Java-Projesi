package com.workintech.productforsale;

public class Bread extends ProductForSale{

    private String breadType;

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    public String getBreadType() {
        return breadType;
    }


    @Override
    public void showDetails() {
        System.out.println(getType()+getBreadType()+getPrice()+getDescription());
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadType='" + breadType + '\'' +
                '}';
    }
}
