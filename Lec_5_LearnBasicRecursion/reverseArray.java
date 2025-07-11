package Lec_5_LearnBasicRecursion;

public class reverseArray {
//    public static void reverseArray(int arr[]){
//
//        int n = arr.length;
//        int ans[] = new int[n];
//
//        for(int i = n -1 ; i >= 0; i--){
//
//        ans[n - i - 1 ] = arr[i];
//        }
//
//        System.out.println("Reversed Array is : ");
//        for(int num : ans){
//            System.out.print(num + " ");
//        }
//public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        reverseArray(arr);
//    }

    public static void printArray(int arr[], int n){
        System.out.println("Reversed Array is : \n");
        for (int i = 0; i< n;i++){
            System.out.print(arr[i] + " ");
        }

    }

public static void reverseArray(int arr[], int start,int end){

    if(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,start+1,end-1);
    }

}

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};

        reverseArray(arr,0,n-1);
        printArray(arr,n);
    }


}
