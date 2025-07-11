package Lec_5_LearnBasicRecursion;

public class stringPalindrome {
    public static boolean isstringPalindrome(String s){
        int n = s.length();
        for(int i = 0;i <= n / 2;i++){
            if(s.charAt(i)!=s.charAt(n - i -1)){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "goa";
        if(isstringPalindrome(str)){
            System.out.println(str + " yes");
        }else {
            System.out.println(str+ " NO");
        }
    }
}
