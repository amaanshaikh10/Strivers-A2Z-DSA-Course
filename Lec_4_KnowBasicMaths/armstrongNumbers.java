package Lec_4_KnowBasicMaths;
import java.util.Scanner;
public class armstrongNumbers {
    public static boolean isarmstrongNumber(int num) {

        int n = num;

        int temp = String.valueOf(num).length();

        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, temp);
            n = n / 10;

        }

        return sum == num ? true : false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is armstrongnumber or not : ");
        int num = sc.nextInt();

        if (isarmstrongNumber(num)) {
            System.out.println("yes " + num + " is armstrongNumber");
        } else {
            System.out.println("NO " + num + " is NOT an  armstrongNumber");
        }
    }
}

