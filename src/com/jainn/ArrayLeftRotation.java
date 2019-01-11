package com.jainn;


public class ArrayLeftRotation {

    private static int[] leftRotatedArray(int rotation, int[] a){
        int[] b = new int[a.length];
        int j=0;
        for(int i = rotation; i < a.length; i++){
            b[j] = a[i];
            j++;
        }
        int i = 0;
        while(j < b.length){
            b[j] = a[i];
            i++;
            j++;
        }
        return b;
    }

    public static void main(String[] args){
     int[] a = {1,2,3,4,5};
     int[] b = leftRotatedArray(5,a);
     for(int element: b){
         System.out.print(element+" ");
     }
    }
}
