import java.util.*;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

// Output for n=5
//   * * * * *
//   * * * *
//   * * *
//   * *
//   *