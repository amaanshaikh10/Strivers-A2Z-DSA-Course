package Lec_5_LearnBasicRecursion;
// ******************* Iterative Solution ************************
//public class FactorialNumber {
//
//    public static int factNumber(int n){
//
//        int fact = 1;
//        for(int i = 1; i<=n;i++){
//             fact = fact *i;
//        }
//        return fact;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        int factorial = factNumber(n);
//        System.out.println(factorial);
//
//    }
//}
// ************************ Recursive Solution ***********************

public class FactorialNumber {
    public static int factNumber(int n){
        if(n == 0)
        {
            return 1;
        }
        return n * factNumber( n -1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factNumber(n));

    }
}