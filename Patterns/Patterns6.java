public class Patterns6 {
    public static void main(String[] args) {
        patt(5);
    }

    public static void patt(int n){
        for(int i = 0 ; i < 2*n ; i++){
            int totalColsInRow = i > n ? 2* n - i  : i;
            int spaces = n-totalColsInRow;
            for(int s= 0 ; s < n-totalColsInRow ; s++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < totalColsInRow ;j++){
               System.out.print("* "); 
            }
            System.out.println();
        }
    }
}

// Output (for n=5)
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
