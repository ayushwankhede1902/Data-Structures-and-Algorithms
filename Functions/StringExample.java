import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String personalised = myGreet("Ayush Wankhede");
        System.out.println(personalised);
    }
    
    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
    
    //passing arguments in a string function
    static String myGreet(String name){
        String message = "Hello I am " + name;
        return message;
    }
}
