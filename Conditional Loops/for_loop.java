import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        /*
         Syntax of For loop:

         for(initialisation ; condition ; increment/decrement){
            //Body
         }
         */

         //Print numbers from 1 to 5
         for(int i = 1 ; i <= 5 ; i+= 1)
         System.out.println(i);

         //print numbers 1 to n
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter the value of n:");
         int n = input.nextInt();

         for(int i = 0 ; i <= n ; i++){
            System.out.println(i);
         }
         
    }
}
