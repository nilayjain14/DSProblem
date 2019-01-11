package com.jainn;


public class SumOfAllContiguousSubArray {

    public static long SubArraySum( int arr[] , int n )
    {
        long result = 0;

        for (int i=0; i<n; i++)
            result += (arr[i] * (i+1) * (n-i));

        return result ;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4} ;
        System.out.println("Sum of SubArray " + SubArraySum(arr, arr.length));
    }
}
