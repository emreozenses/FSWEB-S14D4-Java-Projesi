package com.workintech.productforsale;

import com.workintech.productforsale.Bread;
import com.workintech.productforsale.Cake;
import com.workintech.productforsale.Chocolate;
import com.workintech.productforsale.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate1 = new Chocolate("Beyoglu",52,"findikli","bitter");
        ProductForSale cake1 = new Cake("artisan",25,"limonlu","muffin");
        ProductForSale bread1 = new Bread("eksi maya",15,"klasik","trabzon ekmegi");
        ProductForSale[] products = new ProductForSale[3];
        products[0]=chocolate1;
        products[1]=cake1;
        products[2]=bread1;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }

    }

}
