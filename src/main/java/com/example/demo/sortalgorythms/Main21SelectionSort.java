package com.example.demo.sortalgorythms;

public class Main21SelectionSort {



    public static void main(String[] args) {

        int intArray[] = new int[] {10, -5, 23,-50, 17, 2, -9};

        for (int lastUnsortedIndex= intArray.length -1; lastUnsortedIndex > 0 ; lastUnsortedIndex-- ){
            System.out.println();
            int indexWithMaxValue = 0;

            for(int i = 1; i <= lastUnsortedIndex ; i++ ){
                if(intArray[i] > intArray[indexWithMaxValue]){
                    indexWithMaxValue = i;
                }
            }
            // swap
            swap(intArray, lastUnsortedIndex, indexWithMaxValue);
//            int tempValue = intArray[lastUnsortedIndex];
//            intArray[lastUnsortedIndex] = intArray[indexWithMaxValue];
//            intArray[indexWithMaxValue] = tempValue;

        }

        // check
        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }




    }

    public static void swap(int[] intArray, int lastUnsortedIndex, int indexWithMaxValue){
        int tempValue = intArray[lastUnsortedIndex];
        intArray[lastUnsortedIndex] = intArray[indexWithMaxValue];
        intArray[indexWithMaxValue] = tempValue;
    }



}
