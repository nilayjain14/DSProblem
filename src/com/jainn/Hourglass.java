package com.jainn;

/**
 * Sample Input
 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0
 *
 *
 * Sample Output = 19
 *
 2 4 4
   2
 1 2 4
 *
 *
 */

public class Hourglass {
    static int hourglassSum(int[][] arr) {
        int check_sum = 0;
        int max_sum = -1000;
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                check_sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(check_sum > max_sum) max_sum = check_sum;
            }
        }
        return max_sum;
    }
}
