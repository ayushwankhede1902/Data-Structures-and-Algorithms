import java.util.*;
public class SumFunc {
    public static void main(String[] args) {
      //1st way
      sum();
      //2nd way
      int ans = sum2();
      System.out.println(ans);

      int result = sum3(2,8);
      System.out.println(result);
    }

    //1st way
    static void sum(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number");
      int num1 = input.nextInt();
      System.out.println("Enter the second number");
      int num2 = input.nextInt();
      int sum = num1 + num2;
      System.out.println("The sum is "+sum);
  }

    //2nd way
    //return the value
    static int sum2(){
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    } 
    
    //Pass the value of numbers when you are calling the method 
    static int sum3(int a , int b){
      int add = a + b;
      return add;
    }
}
    
