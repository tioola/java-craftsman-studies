package com.javacraftsman.studies.chapter03;

import java.util.regex.Pattern;

public class CreateCommentsWithExamples {
    /**
     * One of the best way of demonstrating how your method works is through examples. We can take the example below to show you how this would work
     * Regular expressions are a good candidate for those kind of example since they are really complex to understand
     */


    static final Pattern BR_PHONE = Pattern.compile("(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})");


    /**
     * Check if a telphone is a valid brazilian format.
     *
     * Valid Examples:
     * (14) 3284 4666
     * (11) 99102 3453
     *
     *  Invalid Examples:
     *  0492 77 42 34
     *
     * @param telephone telephone to check if is from brazilian formate
     * @return true if it is a brazilian phone and false if it is not.
     */
    public boolean validateBrazilianPhone(String telephone){
        return BR_PHONE.matcher(telephone).matches();
    }

}
