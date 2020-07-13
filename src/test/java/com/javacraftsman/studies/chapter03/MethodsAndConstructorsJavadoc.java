package com.javacraftsman.studies.chapter03;


import com.javacraftsman.studies.domain.NoMoreCapacity;
import com.javacraftsman.studies.domain.Product;
import com.javacraftsman.studies.domain.Warehouse;

import java.util.List;

/**
 * Unlike the other java docs example which are in the quick notes this one i decided to do in a test because it is really important
 * to know how to document properly constructors and methods
 */
public class MethodsAndConstructorsJavadoc {


    /**
     * One example of bad documentation is  something that doesn't say anythin about how and what to expect from the method exexction
     * lets say we have the exampleBelow
     */

    interface WarehouseBadJavaDoc {

        /**
         * Store Products
         * @param products products to be stored
         * @return stored products
         */
        List<Product> store(List<Product> products);

    }


    /**
     * The javadoc above is reaaaallllyyyyy bad and doesn't say anything important about the method, that comment and
     * nothing would be better to have nothing.
     *
     * One good example on how to document the javadoc of your class is like the example below:
     */


    interface WarehouseInventoryNiceJavaDoc {

        /**
         * Store the products in the warehouse of the company
         *
         * <p>
         *     Only lets you stores products if the warehouse is not full and support the requirements of the product like in case there must
         *     be refrigeration
         * </p>
         *
         * <pre>
         *     Product beer = new Product("Beer"......);
         *     Product meat = new Product("Meat"......);
         *     warehouse.store(Arrays.asList(beer,meet));
         * </pre>
         *
         * @throws IllegalArgumentException in case the list is empty OR null
         * @throws com.javacraftsman.studies.domain.NoMoreCapacity in case there is no more capacity
         * @param products products that will be stored in the warehouse
         * @return products stored already linked with the warehouse of reference
         * @see Warehouse#getRemainingFreezerCapacity()  to check the remaining capacity for products that requires freezer
         * @see Warehouse#getRemainingGeneralCapacity()  for products which do not require freezer
         */
        List<Product> store(List<Product> products) throws NoMoreCapacity;

    }

    /**
     * In the code above you have all the information to execute the method correctly and also what to expect from the method execution
     * you can use the @see to point to places where you can pull important information for this method execution or in other words hints to the developer
     *
     */


    /**
     * Constructors don't have meaningful names so you have to take even more care about it. You have to tell the user what to expect
     *
     */
    class InternalWarehouse {


        private Integer capacity;

        private String addressCode;


        /**
         * Creates a new warehouse for the company which should be registered in the Address module.
         *
         * @throws NoMoreCapacity in case the capacity doesn't respect the application rules
         * @throws IllegalArgumentException in case the addressCode doesn't exists
         * @throws NullPointerException in case the capacity or addressCode are null or empty
         * @param capacity the capacity of the warehouse. It should respect the maximum available capacity in the application configuration
         * @param addressCode the addressCode of the warehouse which should come from the address module and should match it.
         *
         */
        public InternalWarehouse(Integer capacity, String addressCode) throws NoMoreCapacity{
            this.capacity = capacity;
            this.addressCode = addressCode;
        }
    }

}
