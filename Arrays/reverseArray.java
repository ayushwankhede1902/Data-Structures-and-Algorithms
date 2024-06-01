import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();


        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Original arrray : "+ Arrays.toString(arr));
        reverse(arr);
        
    }


    public static void reverse(int arr[] ){
        int start = 0;
        int end  = arr.length-1;
        while(start < end){ 
            int temp = arr[start] ; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array : " + Arrays.toString(arr));
        return;
    }

}
