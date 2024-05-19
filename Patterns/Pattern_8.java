import java.util.*;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int num = 1;
        //This pattern is alsoknown as floyd's triangle

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}


// Output for n=5
//   1
//   2 3
//   4 5 6
//   7 8 9 10
//   11 12 13 14 15