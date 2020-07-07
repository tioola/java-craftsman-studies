package com.javacraftsman.studies.chapter02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DoNotRecreateExpensiveObjectsInAnIteration {


    /**
     * When you have an iteration make sure that you will not recreate unecessary object and even most important expensive objects
     * for example the code below is not interesting since Pattern is an expensive object to compile (as you already snould know)
     */

    // This is just a ficticous example no test needed.
    public void find(String regex){
        List<String> listOfStrings = new ArrayList<>();
        for (String string : listOfStrings) {
            if(Pattern.matches(regex, string)){//This operation compiles the matcher every new time. which causes severe performance issues
                System.out.println(String.format("Found ! %s",string));
            }
        }
    }

    public void findImproved(String regex){

        Pattern pattern = Pattern.compile(regex);//Now the compilation happens only once which is a very interesting thing

        List<String> listOfStrings = new ArrayList<>();
        for (String string : listOfStrings) {
            if(pattern.matcher(string).matches()){//we are now using the already compiled pattern which is way better
                System.out.println(String.format("Found ! %s",string));
            }
        }
    }



}
