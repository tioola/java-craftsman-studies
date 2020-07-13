package com.javacraftsman.studies.chapter03;

import com.javacraftsman.studies.domain.Product;

import java.math.BigDecimal;

public class RemoveSuperfluousComments {

    /**
     * Comments are good but might be used in excess and make the code even harder to read. We can take the example of the method
     * below that you can use as reference for a code with a lot of unecessary comments
     */


    // Method to return tax
    public BigDecimal returnTaxOfElectronics(Product product){
        //First check if the product is taxable
        if(product.isElectronic()){
            // Then return the value 0
            return BigDecimal.ZERO;
        }
        //In case product is electronic get the name and add 10%
        return product.getPrice().add(product.getPrice().multiply(BigDecimal.valueOf(0.2)));
    }


    /**
     * In the example above you can see that our code has A LOT of unecessary comments, it is self explanatory.
     * There is even a comment which is wrong since the value to add is not 10 but 20%
     * We can do way better like below
     */


    public BigDecimal returnTaxOfElectronicsWithoutNecessaryComments(Product product){
        if(product.isElectronic()){
            //Return gracefully 0 instead of throwing exception to avoid unecessary errors
            return BigDecimal.ZERO;
        }
        return product.getPrice().add(product.getPrice().multiply(BigDecimal.valueOf(0.2)));
    }

    /**
     * In the code above we removed all the unecessary methods and add one to explain why we are returning 0
     * this is a valid comment which is saying that is preferable to return 0 instead of throwing exception if the
     * client pass a product which is not electronic.
     */

}
