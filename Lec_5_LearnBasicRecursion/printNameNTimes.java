package Lec_5_LearnBasicRecursion;

public class printNameNTimes {
    public static void printName(int i, int n) {

        if (i > n) return;
        System.out.println("Amaan");
        printNameNTimes.printName(i + 1, n);
    }


    public static void main(String[] args) {
        int n = 10;
        printName(1,n);
    }
}
