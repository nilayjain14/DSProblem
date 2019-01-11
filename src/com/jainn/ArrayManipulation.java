package com.jainn;

import java.util.Arrays;
import java.util.TreeSet;


public class ArrayManipulation {

    private static long arrayManipulation(int n, int[][] queries) {
        int j = 0;
        long[] arr = new long[n];
        long max = -1000;
        for(int i = 0; i<queries.length; i++){
            for(int k=queries[i][j]; k<=queries[i][j+1]; k++){
                arr[k-1]=arr[k-1]+queries[i][j+2];
                if(max<arr[k-1]){
                    max = arr[k-1];
                }
            }
        }
        System.out.println("max = " +max);
        return arr[n-1];
    }

    public static void main(String[] args){

        int[][] a = {{1,5,3}, {4,8,7}, {6,9,1}};
                //{{1,2,100}, {2,5,100}, {3,4,100}};
        long out = arrayManipulation(10,a);
        //100 200 200 200 100
        System.out.println(out);
    }
}
