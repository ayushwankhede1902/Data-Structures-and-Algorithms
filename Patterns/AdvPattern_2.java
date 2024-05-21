import java.util.*;
public class AdvPattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n ; i++){
            //Spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Output for n=4
//       ****
//      ****
//     ****
//    ****