public class Patterns8 {
    public static void main(String[] args) {
        patt(5);
    }
    public static void patt(int n){
        for(int i = 1 ; i <= 2*n ; i++){
            int c = i > n ? 2* n - i  : i;
            for(int s= 0 ; s < n-c ; s++){
                System.out.print(" ");
            }
            for(int j = c ; j >= 1 ;j--){
                System.out.print(j);
            }
            for(int j = 2 ; j <= c ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Output(for n = 5)
//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1
