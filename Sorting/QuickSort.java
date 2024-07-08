import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int [] nums = { 5,4,3,2,1};
        sort(nums , 0 , nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums ,int low , int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s <= e){

            // also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[s] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Now my pivot is at correct index so, please sort two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
