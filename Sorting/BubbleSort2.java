import java.util.Arrays;

public class BubbleSort2 {
     // Time complexity = O(n^2)
    // Space complexity = O(1)
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,7,8,3};
        System.out.println(Arrays.toString(arr));
        
        bubble2(arr);
        System.out.println("After Sorting");
        System.out.print(Arrays.toString(arr));
    }


    // Method - 2
    public static void bubble2(int arr[]){
        boolean swapped;
        // run steps n - 1 times
        for(int i = 0 ; i < arr.length ; i++){
            swapped = false;
            // for each step , max item will come at last respective index
            for(int j = 1 ;  j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence break the program
            if(!swapped){
                break;
            }
        }
    }
}
