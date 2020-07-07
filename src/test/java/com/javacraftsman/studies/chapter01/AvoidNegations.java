package com.javacraftsman.studies.chapter01;

import com.javacraftsman.studies.domain.Product;

public class AvoidNegations {

    /**
     * Lets say you want to display a message if you product is sold out or you still have it. and then you create the method below
     */

    private String displayPromotionMessageSmellsBad(Product product){
        if(!product.hasStock()){
            return "Product is sold out please come back next time.";
        }else{
            return "Product is available, hurry up!";
        }
    }

    /**
     * This is a bad practice you are negating it instead of doing something like below which is way more clear
     */


    private String displayPromotionMessage(Product product){
        if(product.hasStock()){
            return "Product is available, hurry up!";
        } else {
            return "Product is sold out please come back next time.";
        }
    }

    /**
     * So always avoid negations and improve the readability of your code.
     */



}
