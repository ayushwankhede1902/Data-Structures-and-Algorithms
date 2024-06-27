import java.util.Arrays;

public class InsertionSort {
    // Time Complexity 
    // Best case = O(n^2)
    // Worst Case = O(n)
    public static void main(String[] args) {
        int arr[] = {1,4,6,3,8,5,0,7,9};
        insertion(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for(int i= 0 ; i < arr.length - 1 ; i++){
            for(int j = i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
