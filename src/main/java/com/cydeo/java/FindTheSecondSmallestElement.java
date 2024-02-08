package com.cydeo.java;

import java.util.Arrays;

public class FindTheSecondSmallestElement {// Java 8 Array Problems

    public static void main(String[] args) {
        int[] numbers ={5,2,8,3,1};
        fetchSecondSmallest(numbers);
    }


    public static void fetchSecondSmallest(int [] arr){
        int secondSmallestElement = Arrays.stream(arr).sorted()
                .skip(1).findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Array does not have second smallest element."));
        System.out.println(secondSmallestElement);
    }


}
