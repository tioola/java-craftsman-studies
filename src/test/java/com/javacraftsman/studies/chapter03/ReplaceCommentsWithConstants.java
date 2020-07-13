package com.javacraftsman.studies.chapter03;

import com.javacraftsman.studies.domain.Product;

import java.math.BigDecimal;

public class ReplaceCommentsWithConstants {


    /**
     * Another good approach is instead of commenting is creating your CONSTANT names or ENUMS, this way your code
     * will be already the documentation and the developer working on it will be able to understand the context without
     * having to read a comment. for example
     */


    public BigDecimal returnTaxOfElectronics(Product product){
        if(product.isElectronic()){
            //Return gracefully 0 instead of throwing exception to avoid unecessary errors
            return BigDecimal.ZERO;
        }

        return product.getPrice().add(product.getPrice().multiply(BigDecimal.valueOf(0.2)));//0.2 is the electronic tax percentage
    }


    /**
     * As you can see in the code above we are explaining that 0.2 is the tax percentage but in fact we could do way better
     * we could do something like below
     */


    private static final BigDecimal ELECTRONIC_TAX_PERCENTAGE = BigDecimal.valueOf(0.2);

    public BigDecimal returnTaxOfElectronicsWithBetterName(Product product){
        if(product.isElectronic()){
            //Return gracefully 0 instead of throwing exception to avoid unecessary errors
            return BigDecimal.ZERO;
        }

        return product.getPrice().add(product.getPrice().multiply(ELECTRONIC_TAX_PERCENTAGE));
    }

    //With the code above we can literally get rid of the comment and make our code way better. HERE WE ARE BASICALLY APPLYING THE
    //MAGIC NUMBER REMOVAL.
}
