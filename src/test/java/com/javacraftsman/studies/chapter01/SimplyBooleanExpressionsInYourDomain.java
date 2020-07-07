package com.javacraftsman.studies.chapter01;

import com.javacraftsman.studies.domain.Product;
import com.javacraftsman.studies.domain.ProductCategory;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SimplyBooleanExpressionsInYourDomain {

    /**
     * In the class SeparatingBooleanExpressionsCOncisely we explain how to do it. but to simplify it better and
     * make the code even cleaner lets put the code below directly in the domain and work with it from there.

     private boolean isSellableInTheElectronicFairSmellsBad(Product product){
         return product.getDescription() != null &&
         product.getPrice() != null &&
         product.getCategory() != null &&
         product.getAmount() > 0 &&
         (product.getCategory() == ProductCategory.SMARTPHONE || product.getCategory() == ProductCategory.TV);
     }
   */

    @Test
    public void testMethodCreatedInDomain() {

        Product sellableProduct = Product.createProduct("Iphone", ProductCategory.SMARTPHONE, BigDecimal.valueOf(2000.00), 10);
        Product apple = Product.createProduct("Apple", ProductCategory.FRUIT, BigDecimal.valueOf(3.0), 100);

        assertThat(sellableProduct.isSellableInElectronicFairs()).isTrue();
        assertThat(apple.isSellableInElectronicFairs()).isFalse();

    }
}
