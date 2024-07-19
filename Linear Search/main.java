import java.util.*;
public class main{
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter the size of array : ");
    //     int n = input.nextInt();
    //     int[] arr = new int [n];
    //     System.out.println("Enter the array elements : ");
    //     for(int i = 0 ; i < arr.length ; i++){
    //         arr[i] = input.nextInt();
    //     }
        
    //     System.out.println("Enter the search value");
    //     int k = input.nextInt();
    //     boolean found = false;
    //     for(int i = 0 ; i < arr.length ; i++){
    //         if(arr[i] == k){
    //             found = true;
    //             break;
    //         }
            
    //     }
    //     if(found){
    //         System.out.println("Found");
    //     }
    //     else{
    //         System.out.println("Not found");
    //     }
        
    // }




    // Linear search using Functions
    public static void main(String[] args) {
        int nums[] = {23,45,32,1,5,7};
        int ans = linearSearch(nums , 1);
        System.out.println(ans);
    }

    public static int linearSearch(int arr[] , int target){
        if(arr.length == 0 ){
            return -1;
        }

        //run a loop
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }

        // this line executes if none of above statements get executed
        // hence no target found;
        return -1;
    }

}