import java.util.*;

// This sorting technique is used only when we are given an array of range (1,N)
// Check ,  Swap , Move

public class CyclicSort {
    // Time Complexity = O(n)
    public static void main(String[] args) {
        int arr[] = {3,6,2,5,8,7,9,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int []arr){
        int i = 0 ; 
        while(i <arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
