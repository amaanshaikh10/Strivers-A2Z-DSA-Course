package Lec_4_KnowBasicMaths;

public class gcdOfTwoNumbers {
    public static int gcdOfTwoNumbers(int n1, int n2){

        if(n2 == 0)
            return n1;
        return gcdOfTwoNumbers(n2,n1 % n2);

//        int gcd = 1;
//        while(n1 > 0 &&  n2 > 0){
//        if(n1 > n2){
//            n1 +=n2;
//
//        }else {
//            n2 += n1;
//        }
//        }
//        if(n1 == 0) return n2;
//        else return n1;
   }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        int gcd = gcdOfTwoNumbers(n1,n2);
        System.out.println("GCD of Two Numbers " + "(" + n1 +"," + n2 + ")" +" is ==> " + gcd);

    }
}
