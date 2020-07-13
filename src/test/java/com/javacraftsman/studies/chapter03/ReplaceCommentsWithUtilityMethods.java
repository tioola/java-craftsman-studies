package com.javacraftsman.studies.chapter03;

import com.javacraftsman.studies.domain.Product;
import com.javacraftsman.studies.domain.ProductCategory;

import java.math.BigDecimal;

public class ReplaceCommentsWithUtilityMethods {


    private static final BigDecimal SMARTPHONE_TAX = BigDecimal.valueOf(0.3);
    private static final BigDecimal TV_TAX = BigDecimal.valueOf(0.15);

    /**
     * Utility methods are good not only to reuse your code but also to give expression to your code and can serve as documentation
     * in the example below we could do it way better with your code
     */

    public Product calculateTax(Product product){

        if(product.isValid() && product.hasStock()){
            if(product.getCategory() == ProductCategory.SMARTPHONE){
                product.applyNewPrice(product.getPrice().add(product.getPrice().multiply(SMARTPHONE_TAX)));
            }else if(product.getCategory() == ProductCategory.TV){
                product.applyNewPrice(product.getPrice().add(product.getPrice().multiply(TV_TAX)));
            }else {
                product.applyNewPrice(product.getPrice());
            }
        }
        return product;
    }

    //TO make it way much more readable and use an utility method 

    public Product calculateTaxWithUtilityMethod(Product product){
        if(product.isValid() && product.hasStock()){
            return applyDiscountBasedOnType(product);
        }else{
            return product;
        }
    }

    public static Product applyDiscountBasedOnType(Product product){

        BigDecimal valueWithTax;

        if(product.getCategory() == ProductCategory.SMARTPHONE){
            valueWithTax = product.getPrice().add(product.getPrice().multiply(SMARTPHONE_TAX));
        }else if(product.getCategory() == ProductCategory.TV){
            valueWithTax = product.getPrice().add(product.getPrice().multiply(TV_TAX));
        }else {
            valueWithTax = product.getPrice();
        }

        return product.applyNewPrice(valueWithTax);
    }





}
