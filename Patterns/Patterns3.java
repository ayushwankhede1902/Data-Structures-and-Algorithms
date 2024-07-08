import java.util.Scanner;

public class Patterns3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        patt(n);
    }
    public static void patt(int n){
         for(int i = 1 ; i <=n ; i++){
            //for every row , run the column
            for(int j = 1 ; j <= n - i + 1 ; j++){
               System.out.print("* "); 
            }
            // When one row is printed we have to add new line
            System.out.println();
         }
    }
}

// Output (for n = 4)
// * * * * 
// * * *
// * *
// *
