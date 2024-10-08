import java.util.*;
public class AdvPattern_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();


        //Palindromic Pattern
        for(int i = 1 ; i <= n ; i++){
            //Spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j = i ; j >= 1 ; j-- ){
                System.out.print(j);
            }
            //2nd half numbers
            for(int j = 2 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


// Output for n=5
//       1
//      212
//     32123
//    4321234
//   543212345