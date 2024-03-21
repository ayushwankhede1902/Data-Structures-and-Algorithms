import java.util.Scanner;
public class CountingOccurence {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the value of n : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Enter the value of Occurence you have to check for : ");
        int occ = input.nextInt();

        while (n>0){
            int rem = n % 10;
            if (rem == occ){
                count++;
            }
            n = n / 10;
        }

        System.out.println("Hence the count of searched number is " +count);
    }
}
