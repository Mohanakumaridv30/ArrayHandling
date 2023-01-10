package com.bridgelabz.problemsonarray;

public class EvenPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 9, 11, 50, 63};
        System.out.println("Elements on array present on even position: ");
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}