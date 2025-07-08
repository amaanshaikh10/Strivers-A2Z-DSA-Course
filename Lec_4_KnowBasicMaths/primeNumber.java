package Lec_4_KnowBasicMaths;

public class primeNumber {
    public static boolean isprime(int num){

        int cnt = 0;

        for(int i = 1; i <= num;i++){
            if(num % i == 0){
                cnt += 1;
            }
        }
        if(cnt == 2){
            return true;
        }else
        return false;
    }

    public static void main(String[] args) {
        int num = 6;
        if(isprime(num)){
            System.out.println("yes : " +num+ " is prime");
        }
        else {
            System.out.println("NO : " +num+ " is not prime");
        }
    }
}
