import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter the value of N : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int num1 = 0 ;
        int num2 = 1 ;
        System.out.println(num1);
        System.out.println(num2);

        for (int i =2; i <= n ; i++){
            int num3 = num1 + num2 ;
            System.out.println(num3);
            num1 = num2 ;
            num2 = num3 ;
        }
    }
}
