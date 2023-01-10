package com.bridgelabz.problemsonarray;

public class SecondLargestElement {
    public static void main(String args[]){
        int temp, size;
        int array[] = {5, 34, 25, 87, 108, 57};
        size = array.length;
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is: "+array[size-2]);
    }
}