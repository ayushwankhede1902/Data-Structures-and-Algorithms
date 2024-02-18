import java.util.Scanner;

public class typecasting {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //type casting
        int num = (int)(53.523f);
        System.out.println(num);

        // automatic type promotion in expressions
        int y = 257;
        byte z = (byte)(y);
        System.out.println(z);

        byte b = 42;
        char c ='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - ( d - s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);  
    }
}