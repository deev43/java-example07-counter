package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Create a function which returns the number of true values there are in an array.
         */

        /*
        countTrue([true, false, false, true, false]) ➞ 2
        countTrue([false, false, false, false]) ➞ 0
        countTrue([]) ➞ 0
         */
        countTrue();
    }

    private static void countTrue() {
        boolean[] counter1 = {true,false,false,true,false,true,true};
        int trueCounter=0;
        int falseCounter=0;

        for (boolean counter:counter1){
            if (counter){
                ++trueCounter;
            }else{
                ++falseCounter;
            }
        }
        System.out.println("counted trues in counter1: "+trueCounter);
    }
}