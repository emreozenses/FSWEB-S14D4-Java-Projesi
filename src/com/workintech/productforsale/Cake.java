package com.workintech.productforsale;

public class Cake extends ProductForSale{

    private String cakeType;

    public Cake(String type, double price, String description, String cakeType) {
        super(type, price, description);
        this.cakeType = cakeType;
    }

    public String getCakeType() {
        return cakeType;
    }


    @Override
    public void showDetails() {
        System.out.println(getType()+getCakeType()+getPrice()+getDescription());
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cakeType='" + cakeType + '\'' +
                '}';
    }
}
