package com.jainn;

import java.util.ArrayList;

public class PowerSetInArray {

    public static void main(String[] args){

        ArrayList<Integer> arr = new  ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        double power_set = Math.pow(2,arr.size()) ;
        for(int i = 0; i <  power_set; i++)
        {
            for(int j = 0; j < arr.size(); j++)
            {
                if((i & (1 << j)) > 0)
                    System.out.print(arr.get(j));
            }

            System.out.println();
        }
    }
}
