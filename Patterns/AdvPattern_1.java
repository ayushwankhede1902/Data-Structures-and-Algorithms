import java.util.*;
public class AdvPattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();
         //  This pattern is also known as Butterfly pattern


         //  Upper half
        for(int i = 1 ; i <= n ; i++){
             //  1st part
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
             //  Spaces
            int spaces = 2*(n-i);
            for(int j = 1 ; j <=spaces ; j++){
            System.out.print(" ");
            }
             //  2nd part
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         //  Lower half
        for(int i = n ; i >= 1 ; i--){
             //  1st part
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
             //  Spaces
            int spaces = 2*(n-i);
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print(" ");
            }
             //  2nd part
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



 // Output for n=5

 //     *        *
 //     **      **
 //     ***    ***
 //     ****  ****
 //     **********
 //     **********
 //     ****  ****
 //     ***    ***
 //     **      **
 //     *        *