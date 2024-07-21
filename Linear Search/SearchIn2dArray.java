import java.util.*;
public class SearchIn2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = input.nextInt();

        int arr[][] = new int [rows][cols];
        System.out.println("Enter the elements of the array:");
        //Input
        for(int i = 0 ; i < rows ; i++){
            for(int j= 0 ; j < cols ; j++){
                arr[i][j]=input.nextInt();
            }
        }

        //Output
        for(int i= 0 ; i <rows ; i++){
            for(int j=0;j<cols ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the search value");
        int target = input.nextInt();
        int[] ans  = Search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
     public static int[] Search (int[][] arr ,int  target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                
            }
           
        }
        return new int[]{-1,-1};
        
     }
}
