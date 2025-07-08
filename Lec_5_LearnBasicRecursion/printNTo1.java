package Lec_5_LearnBasicRecursion;

public class printNTo1 {
    public static void printNTo1(int i){
        if(i < 1) return;
        System.out.println(i);
        printNTo1(i - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        printNTo1(n);
    }
}
