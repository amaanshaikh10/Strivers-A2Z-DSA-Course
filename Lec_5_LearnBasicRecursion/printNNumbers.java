//Print 1 to N using Recursion
//Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
//
//You must not use any loops such as for, while, or do-while.
//The function should print each number on a separate line, in increasing order from 1 to n.
//


package Lec_5_LearnBasicRecursion;

public class printNNumbers {
    public static void printNumber(int i,int n){

        if(i > n) return;
        System.out.println(i);
        printNNumbers.printNumber(i+1,n);


    }

    public static void main(String[] args) {
        int n = 50;
        printNumber(1,n);

    }
}
