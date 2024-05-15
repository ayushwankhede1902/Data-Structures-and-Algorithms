import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of m: ");
        int m = input.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}




// Output (for n=4 and m=5)
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
