package com.example.demo.sortalgorythms;

public class MainExercise {



    public static void main(String[] args) {


        int[] intArray = new int[] {1,5,10,7};

        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        System.out.println();


//        {7,5,10,1};

        int temp = intArray[0];
        intArray[0] = intArray[3];
        intArray[3] = temp;




        for(int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }


    }



}
