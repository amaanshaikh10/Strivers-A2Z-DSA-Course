package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

public class bubbleSort {
    public static void bubbleSort(int arr[],int n) {

        for(int i = n-1;i>= 0;i--){
            int didswap = 0;
            for(int j = 0;j <= i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
            System.out.println("\n" + didswap + " runs");
        }
    }
    public static void main(String[] args) {
        int arr[] = {51, 41, 31, 21, 11, 10};
        int n = arr.length;
        System.out.print("Before sorting : ");
        for (int x : arr) {
            System.out.print(x + " ");

        }

        bubbleSort(arr, n);
        System.out.print("\nAfter sorting : ");
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}
