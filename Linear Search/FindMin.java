import java.util.*;
public class FindMin {
    public static void main(String[] args) {
        int arr[] = {34,24,92,76,15,8};
        System.out.println(MinNumber(arr));
    }


    public static int MinNumber( int arr[]){
        if(arr.length == 0){
            return -1;
        }
        int minimum =arr[0] ;
        for(int i = 1 ; i < arr.length ; i++){
          if(arr[i] < minimum){
            minimum = arr[i];
          }

        }
        return minimum;
    }


}
