import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int ans = 0;
        System.out.println("Enter the value of n : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n>0){
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
