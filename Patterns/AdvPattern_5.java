import java.util.*;
public class AdvPattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = input.nextInt();


        //Upper Half
        for(int i = 1 ; i <= n ; i++){
            //Spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //Stars
            int star = (2*i) - 1;
            for(int j = 1 ; j <=star ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for(int i = n ; i >= 1 ; i--){
            //Spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //Stars
            int star = (2*i) - 1;
            for(int j = 1 ; j <=star ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Output for n=4
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *