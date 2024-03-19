import java.util.Scanner;
public class largestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && a > c){
            System.out.println("The greatest number is " +a);
        }
        else if (b > a && b > c){
            System.out.println("The greatest number is " +b);
        }
        else{
            System.out.println("The greatest number is " +c);
        }


        //Method 2
        int max = a;
        if(b > max){
             max = b;
        }
       if (c > max){
             max = c;
         }
         System.out.println(max);

         //Method 3
         int maximum = Math.max(c , Math.max(a,b));
         System.out.println(max);
    }
}

