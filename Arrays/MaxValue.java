import java.util.*;
public class MaxValue {
    public static void main(String[] args) {
        int arr[] = {1,7,3,5,6,9,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr , 1 , 3));

    }

    // for a given range of index
    public static int max(int arr[]){
        int maxvalue = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > maxvalue){
                 maxvalue = arr[i];
            }
        }
        return maxvalue;
    } 


    public static int maxRange(int arr[] , int start , int end){
        int maxvalue = arr[start];

        if(arr ==null){
            return -1 ; 
        }
        
        for(int i = 1 ; i <= end ; i++){
            if(arr[i] > maxvalue){
                 maxvalue = arr[i];
            }
        }
        return maxvalue;
    } 
}
