package com.jainn;


import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args){
        int[] arr1 = { 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr3 = mergeArray(arr1,arr2);
        for(int ele : arr3){
            System.out.println(ele);
        }

    }

    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            arr[i] = arr1[i];
        }
        int j = 0;
        for(int i=arr1.length; i<arr.length; i++){
            arr[i] = arr2[j];
            j++;
        }

        Arrays.sort(arr);
        return arr;
    }
}
