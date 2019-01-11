package com.jainn;

public class LargestSumContiguousSubarray {

    public static void main (String args[]){
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int max = 0, min = 0;

        for (int i = 0; i < a.length; i++)
        {
            min = min + a[i];
            if (max < min)
                max = min;
            if (min < 0)
                min = 0;
        }
        return max;
    }
}
