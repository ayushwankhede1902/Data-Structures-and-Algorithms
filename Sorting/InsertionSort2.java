import java.util.*;
public class InsertionSort2 {
    // Time Complexity 
    // Best case = O(n^2)
    // Worst Case = O(n)
    public static void main(String[] args) {
        int arr[] = {1,4,6,3,8,5,0,7,9};

        for(int i = 0 ; i < arr.length- 1 ; i++){
            int current =  arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
