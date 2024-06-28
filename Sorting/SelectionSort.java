// Select an element and put it on its correct index

import java.util.*;
public class SelectionSort{
    // Time Complexity = O(n^2)
    public static void main(String[] args) {
        int arr[] = {1,4,6,3,8,5,0,7,9};
        selection(arr);
        System.out.print(Arrays.toString(arr));
        
    }
    public static void selection(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            //find max item in the remaining index  and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr , maxIndex , last);
        } 
    }

    public static int getMaxIndex(int[]arr , int start , int end){
        int max = start;
        for(int i = 0 ; i <= end ; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second] ; 
        arr[second] = temp;
    }
}