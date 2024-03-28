public class ScopeFunc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        random(55);

        {
            //block scope

           // int a = 90;  -> already initialized outside the block in same method , hence you cannot initialize it again but can change the value
            a =  55;
            int c = 43;
            //values initialized in this block will remain in this block
        }
        System.out.println(a);
       // System.out.println(c);  cannot use outside the block
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
       
        // Scoping in this example means that you can access num and marks only in this function and nowhere else
    }
}

