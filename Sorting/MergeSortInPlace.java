import java.util.*;

public class MergeSortInPlace {
     public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        mergesortinplace(arr , 0 , arr.length );
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesortinplace(int[] arr, int s ,int e){
        if(e -s == 1){
            return ;
        }

        int mid = s + (e - s) / 2;
        mergesortinplace(arr, s , mid);
        mergesortinplace(arr, mid, e);

        mergeinplace(arr , s , mid , e);
    }

    public static void mergeinplace(int[] arr , int s , int m , int e){
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // It may be possible that one of the arrays is not complete
        // Copy the remaining elements
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        
        for(int l = 0 ; l < mix.length ; l++){
            arr[s + l] =  mix[l];
        }
    }
}
