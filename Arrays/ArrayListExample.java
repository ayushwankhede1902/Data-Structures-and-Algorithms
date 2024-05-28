import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        list.add(12);
        list.add(324);
        list.add(3563);
        list.add(75);
        list.add(76);
        list.add(2654);
        list.add(7442);
        System.out.println(list);  // print list

        System.out.println(list.contains(75)); // to check if a given element is present or not
        
        list.set(1,32);  // changes the value of element present at 1st index
        list.remove(2);  // removes element present at 2nd index
        System.out.println(list);

        Scanner input = new Scanner(System.in);


        //input
        for(int i = 0 ; i < 5 ; i++){
            list2.add(input.nextInt());

        }

        //get item at any index
        for(int i = 0 ; i<5 ; i++){
            System.out.println(list2.get(i));
        }

        //to print list
        System.out.println(list2);
    }
}
