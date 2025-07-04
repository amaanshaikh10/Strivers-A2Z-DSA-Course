package Lec_4_KnowBasicMaths;

public class reverseNumber {
    public static int reverseNumber(int num){
        int rev = 0;
        while (num > 0){
            int lastNum = num % 10;
            rev = rev * 10 + lastNum;
            num /= 10;

        }

        return rev;
    }

    public static void main(String[] args) {
        int num = 321;
        int number = reverseNumber(num);
        System.out.println(num + " ==> reversed number is :" + number);
    }

}
