import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
           // Print all the 3 digit Armstrong Numbers
           // Eg 153 = 1^3  +  5^3  +  3^3 = 153
        boolean ans = check(n);
        System.out.println(ans);

        for(int i = 100; i <= 999 ; i++){
            if(check(i)){
                System.out.println(i);
            }
        }

 }

    static boolean check(int n){
        int sum = 0;
        int original = n;  
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem*rem*rem);
        }

        return sum ==  original;
    }
}
