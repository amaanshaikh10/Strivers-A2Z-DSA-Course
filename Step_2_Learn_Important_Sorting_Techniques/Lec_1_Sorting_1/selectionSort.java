package Step_2_Learn_Important_Sorting_Techniques.Lec_1_Sorting_1;

public class selectionSort {

    public static void selection_sort(int arr[], int n){
        for(int i = 0; i <= n - 2;i++){
            int minim = i;
            for(int j = i + 1; j<= n - 1;j++){
                if(arr[j] < arr[minim]){
                     minim = j;
                }
            }
            // swap
            int temp = arr[minim];
            arr[minim] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {51,41,31,21,11,10};
        int n = arr.length;
        System.out.print("Before sorting : ");
        for(int x : arr){
            System.out.print(x + " ");

        }
        selection_sort(arr,n);
        System.out.print("\nAfter sorting : ");
//      for(int x : arr){
//            System.out.print(x + " ");
//      }
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
