package com.jainn;

public class SecondHighestNum {

    public static void main(String[] args){
        int[] arr = {1,3,4,5,2,10,9};
        int ele = getSecondHighest(arr);
        System.out.println(ele);
    }

    private static int getSecondHighest(int[] arr) {
        int max = -1;
        int s_max = -1;
        for(int ele : arr){
            if(max < ele){
                s_max = max;
                max = ele;
            }
            if(s_max < ele && max != ele){
                s_max = ele;
            }
        }
        return s_max;
    }
}
