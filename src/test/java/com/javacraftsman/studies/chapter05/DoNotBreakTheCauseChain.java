package com.javacraftsman.studies.chapter05;

public class DoNotBreakTheCauseChain {

    /**
     * A common thing that happens when people break the cause chain is whey you wrap an exception and rethrow another one like the example below
     */

    public void breakingTheCauseChain(String valueToConvert){

        try{
            int id = Integer.parseInt(valueToConvert);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException(String.format("Expected number, but got %s when converting value", valueToConvert));
        }

        System.out.println("Some other operations happening here....");
    }


    /**
     * The problem with the code above is that you are rethrowing a new exception without passing the chain to the new exception
     * this will affect the chain and you won't be able to look at the stacktrack correctly. This might cause a lot of misunderstandings
     * while debugging the code. to fix that use the constructor and pass the chain as you can see below
     */

    public void notBreakingTheCauseChain(String valueToConvert){

        try{
            int id = Integer.parseInt(valueToConvert);
        } catch (NumberFormatException ex){
            throw new IllegalArgumentException(String.format("Expected number, but got %s when converting value", valueToConvert), ex);//Here I'm passing the chain forward.
        }

        System.out.println("Some other operations happening here....");
    }

}
