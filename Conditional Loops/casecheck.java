import java.util.Scanner;
public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // .trim() removes all the extra spaces when we input a string
        //.charAt(0) converts a string into character. This is because we want a character for checking if it is a lowercase or uppercase
        System.out.println("The character you have selected is " +ch);

        if (ch>=97 && ch<=122){
            System.out.println("It is a LowerCase character");
        }
        else if (ch>=65 && ch<=90){
            System.out.println(" It is an Uppercase character");
        }
        else{
            System.out.println("Cant say");
        }

        //Method 2
        if (ch >= 'a' && ch <='z'){
            System.out.println("It is a LowerCase character");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("It is an Uppercase character");
        }
        else {
            System.out.println("Cant say");
        }
    }
}
