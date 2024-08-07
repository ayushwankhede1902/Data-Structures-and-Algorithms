import java.util.*;
public class QuickSort2 {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,7,85,24,99,67,216,868,6,9,65};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums , int low , int hi){
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;             
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;

            }
        }
        sort(nums,low ,e);
        sort(nums , s, hi);

    }
}
