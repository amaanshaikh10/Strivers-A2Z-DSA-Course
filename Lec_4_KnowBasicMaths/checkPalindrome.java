package Lec_4_KnowBasicMaths;

public class checkPalindrome {

    public static boolean checkPalindrome(int num){
        int revNumber = 0;
        int dup = num;
        while (num > 0){
            int lastNum = num % 10;
            revNumber = revNumber * 10 + lastNum;
            num /= 10;

        }
        if(dup == revNumber){
            return true;

        }else {
            return false;
        }


    }

    public static void main(String[] args) {

        int num = 121;
        if(checkPalindrome(num)){
            System.out.println(num + " ==> is Palindrome");
        }else{
            System.out.println(num + " ==> is not Palindrome");
        }

    }
}
