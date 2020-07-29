package com.javacraftsman.studies.chapter07;

import java.util.Collections;
import java.util.List;

public class AvoidLeakingReference {

    /**
     * A very commom mistake that a lot of developer does is leaking references. For example if you have something like the class below
     *
     */

    class Inventory {

        List<String> items;

        public List<String> getItems() {
            return items;
        }

        public void setItems(List<String> items) {
            this.items = items;
        }
    }

    /**
     * In the example above you might have classes that access yoru supplier list and they might do whatever they want
     * with you list which might cause problems for example
     *
     */

    public void myMaliciousClient(){

        Inventory inventory = new Inventory();

        inventory.setItems(null);
    }

    /**
     * The code above might clean your list even tought it shouldn't
     * So it is not good.
     */


    /**
     * Another bad example would be something like below
     */


    public void myMaliciousCode2(){

        Inventory inventory = new Inventory();

        inventory.getItems().clear();
    }

    /**
     * To solve the problem one best approach would be hide the setter method and in the get return an umodifiable list
     */

    class InventoryCorrect {

        List<String> items;

        public List<String> getItems() {
            return Collections.unmodifiableList(items);
        }


    }

    /**
     * The code above would prevent any malicious client to corrupt the state of your class
     */

    /**
     * Another interesting example would be provide methods which limit the access of the list only providing what is necessary
     */


    class InventoryAnotherExample {

        List<String> items;

        public String getItem(Integer index) {
            return items.get(index);
        }

        public void addItem(String item){
            this.items.add(item);
        }
    }

}
