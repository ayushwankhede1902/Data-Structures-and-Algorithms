import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        //Syntax for Switch Statements
        /*
          switch(expression){
            //cases
            case one:
            // do something
            break;

            case two:
            // do something
            break;

            default:
            //do something
          }
         */
        System.out.println("Enter a fruit name: ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
    
        switch (fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;

            case "Apple":
            System.out.println("A sweet red fruit");
            break;

            case "Orange":
            System.out.println("A round fruit");
            break;

            case "Grapes":
            System.out.println("A very small fruit");
            break;

            default:
            System.out.println("Please enter a valid fruit");
        }

        // New syntax of switch statement
        System.out.println("Enter name of an animal");
        String animal = input.next();
        switch (animal){
            case "Dog" -> System.out.println("Dog barks");
            case "Cat" -> System.out.println("Cat meows");
            case "Lion" -> System.out.println("Lion roars");
            case "Monkey" -> System.out.println("Monkey whoops");
            default -> System.out.println("Please enter a valid choice");
        }

        //Example of not using a break statement
        System.out.println("Enter a day");
        int day = input.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Week day");
            case 6,7 -> System.out.println("Weekend day");
        }
    }
}
