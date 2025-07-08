package Lec_5_LearnBasicRecursion;

public class SumofFirstNNumbers {

//    ******************* using for loop *****************
//    public static int SumofFirstNNumbers(int n){
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum+=i;
//        }
//        return sum;
//
//    }
//public static void main(String[] args) {
//    int n = 4;
//    int result = SumofFirstNNumbers(n);
//    System.out.println(result);
//
//}

  //  ***************** using recursion ******************
    public static int SumofFirstNNumbers(int n){
        if(n == 0) return 0;
        return n +SumofFirstNNumbers(n - 1);

    }

    public static void main(String[] args) {
        int n = 4;
        int result = SumofFirstNNumbers(n);
        System.out.println(result);
    }


}
