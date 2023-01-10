package com.bridgelabz.problemsonarray;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 4, 4, 3, 5, 5, 6, 7, 7, 8};
        System.out.println("Duplicate Numbers in the Arrays are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}