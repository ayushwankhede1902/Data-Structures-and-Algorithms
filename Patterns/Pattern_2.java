import java.util.*;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of m: ");
        int m = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if( i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}

// Output for n=4 and m=5
//      *****
//      *   *
//      *   *
//      *****