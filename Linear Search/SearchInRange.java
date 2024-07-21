import java.util.*;
public class SearchInRange {

    // Search for target in any given range
    public static void main(String[] args) {
        int arr[] = {18,12,42,46,54};
        
        int ans = SearchinRange(arr , 46, 2,4 );
        System.out.println(ans);

        
    }

    public static int SearchinRange(int arr[] , int target , int start , int end){
        if(arr.length == 0 ){
            return -1;
        } 
        //run a loop
        for(int i = start ; i <= end ; i++){
            if(arr[i] == target){
                System.out.println("Found at index");
                return i ;
                
            }
        }

        // this line executes if none of above statements get executed
        // hence no target found;
        return -1;
    }
}
