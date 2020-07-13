package com.javacraftsman.studies.domain;

import java.math.BigDecimal;

public class Product {

    private String description;

    private ProductCategory category;

    private BigDecimal price;

    private Integer amount;


    private Product(String description, ProductCategory category, BigDecimal price, Integer amount) {
        this.description = description;
        this.category = category;
        this.price = price;
        this.amount = amount;
    }

    public static Product createProduct(String description, ProductCategory type, BigDecimal price, Integer amount) {
        return new Product(description, type, price, amount);
    }

    //Here we are enforcing immutability
    public Product applyNewPrice(BigDecimal newPrice){
        return new Product(this.description, this.category,  newPrice, amount);
    }

    public String getDescription() {
        return description;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }


    //Example of test class  SimplyBooleanExpressionsInYourDomain
    public boolean hasStock(){
        return amount > 0;
    }

    public boolean isValid(){
        return this.getDescription() != null && this.getPrice() != null && this.getCategory() != null;
    }

    public boolean isElectronic(){
        return this.getCategory() == ProductCategory.SMARTPHONE || this.getCategory() == ProductCategory.TV;
    }

    // even more clear this way
    public boolean isSellableInElectronicFairs(){
        return isValid() && hasStock() && isElectronic();
    }
}
