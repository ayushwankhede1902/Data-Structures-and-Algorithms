import java.util.Scanner;

public class Patterns5 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        //patt(n);
        pattMethod2(n);
    }
    public static void patt(int n){
         for(int i = 1 ; i <=n ; i++){
    
            for(int j = 1 ; j <= i ; j++){
               System.out.print("* "); 
            }
            
            System.out.println();
         }

         for(int i = 1 ; i <=n ; i++){
    
            for(int j = 1 ; j <= n-i ; j++){
               System.out.print("* "); 
            }
            
            System.out.println();
         }
    }

    public static void pattMethod2(int n){
        for(int i = 0 ; i < 2*n ; i++){
            int totalColsInRow = i > n ? 2* n - i  : i;
            for(int j = 0 ; j < totalColsInRow ;j++){
               System.out.print("* "); 
            }
            System.out.println();
        }
    }
}


// Output (for n = 5)
// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
