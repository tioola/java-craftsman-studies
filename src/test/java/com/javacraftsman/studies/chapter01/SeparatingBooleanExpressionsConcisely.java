package com.javacraftsman.studies.chapter01;

import com.javacraftsman.studies.domain.Product;
import com.javacraftsman.studies.domain.ProductCategory;

public class SeparatingBooleanExpressionsConcisely {

    /**
     * In case you want to do create a method which provides the validation of more than one condition for example
     * lets say we want to create a method to check if a product is sellable in the electronic fair. for that we need
     * to check if the product is valid. if it is not sold out and also if it is of category SMARTṔHONE or TV
     *
     * if you do that in a dirtyWay you would have
     */

    private boolean isSellableInTheElectronicFairSmellsBad(Product product){
        return product.getDescription() != null &&
               product.getPrice() != null &&
               product.getCategory() != null &&
                product.getAmount() > 0 &&
                (product.getCategory() == ProductCategory.SMARTPHONE || product.getCategory() == ProductCategory.TV);

    }


    /**
     * As you can see this is really dirty and hard to read you don't know what conditions a product need just looking at the code you need to indenfity and debug in that case
     * the best approach is to separate the conditions and check in the end.
     */


    private boolean isSellableInTheElectronicFair(Product product){
        // Ofc would be better to have those validation inside of the domain (which is demonstrated in another test)

        boolean productValid = product.getDescription() != null && product.getPrice() != null && product.getCategory() != null;
        boolean electronicType = product.getCategory() == ProductCategory.SMARTPHONE || product.getCategory() == ProductCategory.TV;
        boolean hasStock = product.getAmount() > 0;

        return productValid && electronicType && hasStock;
    }

    /**
     * The code above is way better to read , since you separated each validation with its own context and in the end you check
     * all of them... way better and more clear toread.
     */
}
