import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {
        int arr[] = {-5,2,32,54,65,67,68,87,97,99};
        int target = 87;
        System.out.println(BinarySearch(arr,target));

    }

    public static int  BinarySearch(int arr[] , int target){
        int start = 0 ;
        int end = arr.length;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid -1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;          
    }
}