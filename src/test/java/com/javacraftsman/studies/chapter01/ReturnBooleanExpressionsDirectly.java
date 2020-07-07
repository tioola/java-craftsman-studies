package com.javacraftsman.studies.chapter01;

import com.javacraftsman.studies.domain.Product;

public class ReturnBooleanExpressionsDirectly {

    /**
     * when you create a method which returns boolean do not do something like below:
     */


    private boolean isProductValidSmellsBad(Product product) {
        if (product.getDescription() == null || product.getPrice() == null || product.getCategory() == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * You are adding too much lines of code for somthing that should be way more simples, in this case you can invert the condition applying
     * the morgans law and do it in only one line instead for example
     */


    private boolean isProductValid(Product product) {
        return product.getDescription() != null && product.getPrice() != null && product.getCategory() != null;
    }

    //This code is way better

}
