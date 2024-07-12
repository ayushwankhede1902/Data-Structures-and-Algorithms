public class Patterns7 {
    public static void main(String[] args) {
        patt(5);
    }
    public static void patt(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int s= 0 ; s < n-i ; s++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ;j--){
                System.out.print(j);
            }
            for(int j = 2 ; j <= i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Output (for n = 5)
//     1    
//    212   
//   32123  
//  4321234 
// 543212345