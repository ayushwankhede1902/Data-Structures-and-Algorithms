import java.util.*;
public class SearchInStrings {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Enter the target value");
        char target = input.next().charAt(0);
        boolean ans = search(str , target);
        System.out.println(ans);
    }

    public static boolean search(String str ,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)==target){
               return true;
            }
        }
        return false;
    }
}
