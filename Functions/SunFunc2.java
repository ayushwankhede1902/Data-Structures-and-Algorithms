import java.util.*;
public class SunFunc2 {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);
    }
}
