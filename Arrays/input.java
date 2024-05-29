import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 23 ;
        arr[1] = 43 ;
        arr[2] = 71 ;
        arr[3] = 25 ;
        arr[4] = 85 ;
        System.out.println(arr[3]);

        // Input using for loop
        System.out.println("Taking input using for loop");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = input.nextInt();
        }

        // Printing elements of an array
        for (int i = 0 ; i < arr.length ; i++){
             System.out.print(arr[i] + " ");
        }
        
        // Printing elements in an array by another method
       for( int num : arr){
           System.out.println(num + " ");
        }
        
        // Printing the elements in an array BEST METHOD
        System.out.println(Arrays.toString(arr));





        


        // Array of objects
        System.out.println("Array of objects");
        String[] str = new String[5];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
