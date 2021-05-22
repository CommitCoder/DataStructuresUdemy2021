package com.example.demo.sortalgorythms;

public class Main18BubbleSort {


    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22 };

        for(int unsortedPartitionIndex = intArray.length-1; unsortedPartitionIndex >0; unsortedPartitionIndex-- ){
            for(int i = 0; i< unsortedPartitionIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i = 0; i < intArray.length -1; i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] intArray, int i, int j){
        int temp = 0;
        temp =intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }



}
