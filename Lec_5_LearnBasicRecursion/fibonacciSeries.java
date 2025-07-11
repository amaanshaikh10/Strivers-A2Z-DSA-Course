package Lec_5_LearnBasicRecursion;

import java.util.Scanner;
public class fibonacciSeries {

    // ****************************  Naive approach ***************************************
//    public static void main(String[] args) {
//        System.out.println("Enter the number you want series: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int fib[] = new int[n + 1];
//
//        if(n == 0){
//            System.out.println(0);
//        }else {
//            fib[0] = 0;
//            fib[1] = 1;
//
//            for(int i = 2; i <= n; i++){
//                 fib[i] = fib[i - 1] +fib[i - 2];
//            }
//        }
//        System.out.println("The fibonacci Series upto " + n + "th term is : ");
//        for(int i = 0; i<= n;i++){
//            System.out.print(fib[i] + " ");
//        }
//    }

    public static int fibonacciSeries(int n){
        if(n <= 1) {
            return n;
        }
        int last = fibonacciSeries(n - 1);
        int slast = fibonacciSeries(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacciSeries(n));

    }
}
