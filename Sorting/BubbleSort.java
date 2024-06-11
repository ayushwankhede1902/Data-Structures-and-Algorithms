import java.util.*;
public class BubbleSort {
    // Time complexity = O(n^2)
    // Space complexity = O(1)
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7,8,3};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println("After Sorting");
        System.out.print(Arrays.toString(arr));
    }

     public static void bubble(int arr[]){
        for(int i = 0 ; i < arr.length-1 ; i++){ //n-1
            for(int j = 0 ; j < arr.length - i -1 ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
