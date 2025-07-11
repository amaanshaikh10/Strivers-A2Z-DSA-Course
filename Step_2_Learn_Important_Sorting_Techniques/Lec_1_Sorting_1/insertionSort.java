package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

public class insertionSort {
    public static void insertionSorting(int arr[], int n){

        for(int i = 0; i<= n-1; i++){
            int didswap = 0;
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
                didswap = 1;
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

        insertionSorting(arr, n);
        System.out.print("\nAfter sorting : ");
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}
