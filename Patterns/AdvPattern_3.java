import java.util.*;
public class AdvPattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
            //   Spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //   Numbers
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// Output for n=5
//        1   
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5 