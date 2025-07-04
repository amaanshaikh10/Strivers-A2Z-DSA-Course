package Lec_4_KnowBasicMaths;
import java.util.Scanner;


public class count {

    public static int countDigits(int num){


        int cnt = 0;
        while(num > 0 ){
            cnt += 1;
            num /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the digits present in it");

        int num = sc.nextInt();

        int digits = countDigits(num);

        System.out.println(" digits present : "+digits);


    }
}
