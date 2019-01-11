package com.jainn;


public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.printf("List of Prime No:");
        for(int n = 2 ; n<=20 ; n++){
            if (isPrime(n)) {
                System.out.printf(" " + n);
            }
        }
    }

    public static boolean isPrime(int n) {
        int m = n/2;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}