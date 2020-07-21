package com.javacraftsman.studies.chapter05;

import com.javacraftsman.studies.domain.Product;

import java.math.BigDecimal;

public class FailFast {


    /**
     * Failing fast will really let your code more readable, you can use your if conditions like guards
     * which can be validated before the actual code.
     */


    //Check the example below without the fail fast and how this will affect the readibility of your code.


    /*
    * apportion = ratear.
    * */
    public void apportionIncreaseValue(BigDecimal newValue, Product product){
        if(!product.hasStock()){
            throw new IllegalArgumentException("Product do not have stock");
        }else if(product.getPrice().doubleValue() < newValue.doubleValue()){
            System.out.println("Execute complex logic to do the apportion");
        }else{
            throw new IllegalArgumentException("newValue should not lower than previous value.");
        }
    }

    /**
     * As you can see above the example is pretty dirty and you don't know exactly what is happening, you have to debug.
     * On the other hand if you use the Fail Fast method you will end up with a WAY more clear code as you can see below
     */

    public void apportionIncreaseValueFailFast(BigDecimal newValue, Product product) {

        if(!product.hasStock()){
            throw new IllegalArgumentException("Product do not have stock");
        }

        if(product.getPrice().doubleValue() > newValue.doubleValue()){
            throw new IllegalArgumentException("New value should not be lower compared to the old value");
        }

        System.out.println("Execute complex logic to do the apportion");

    }


    /**
     * In the example above you noticed how better it is to read the code. All the validation is done on top of the
     * method and act like "guards". Also it prevents you to execute unecessary code depending of the situation.
     *
     */
}
