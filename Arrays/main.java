
public class main {
    public static void main(String[] args) {
        // Q: Store a roll no.
        int a = 10;

        // Q: Store a person's name
        String name ="Ayush Wankhede";

        // Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 43;
        int rno3 = 4;
        // It is very hard to store a large number of datatypes , so here we use arrays

        // Syntax
        // datatype[] = new datatype[size]
        
        // Store 5 roll numbers:
        int[] rnos = new int[5];
        //or we can directly write
        int[] rnos2 = {23 , 12 , 45 , 32 , 22};

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialisation actually  here object is being created in the memory(heap)
        System.out.println(ros[0]);          // Shows 0
        System.out.println(rnos2[0]);        // Shows 23


        String[] arr1 = new String[4];
        System.out.println(arr1[0]);         // Shows null

    }
}
