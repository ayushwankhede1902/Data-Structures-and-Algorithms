public class Patterns9 {
    public static void main(String[] args) {
        patt(5);
    }
    public static void patt(int n){
        n = 2*n;
        for(int i = 0 ; i <= n; i++){
            for(int j = 0 ; j <= n ;j++){
                int atEveryIndex = Math.min(Math.min(i,j) , Math.min(n-i , n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}


// Output (for n = 5)
// 0 0 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 2 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0 
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 4 5 4 3 2 1 0
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0       
// 0 1 2 2 2 2 2 2 2 1 0 
// 0 1 1 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0 0 0
