package com.bridgelabz.problemsonarray;

public class SmallestNumber {
    public static void main(String[] args) {
        int [] arr = new int [] {9, 1, 7, 8, 6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest Element in array: " + min);
    }
}