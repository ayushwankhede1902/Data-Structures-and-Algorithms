import java.util.*;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


// Output for n=5
//  1 2 3 4 5
//  1 2 3 4
//  1 2 3
//  1 2
//  1