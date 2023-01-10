package com.bridgelabz.problemsonarray;

public class ReverseOrder {
    public static void main(String[] args) {
        int [] arr = new int [] {3, 5, 8, 20, 35, 70, 90};
        System.out.println("The Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}