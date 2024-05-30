import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = {
//            {1,2,3}, //0th index
//            {4,5,6}, //1st index
//            {7,8,9}  //3rd index
//        };
        
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        //Input

        Scanner input = new Scanner(System.in);

        for(int i=0 ; i<arr.length ; i++){
            // for each col in every row
            for(int j=0 ; j<arr[i].length;j++){
                arr[i][j] = input.nextInt();           
            }
        }

        //Output
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Output by another method
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //Output by enhanced for loop
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
        
    }
}


