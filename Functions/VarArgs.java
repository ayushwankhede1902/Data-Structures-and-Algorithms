import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,4,3,7,8);
        multiple(3,4,"Ayush","Om","Arnav","Anurag");
    }


    static void fun(int ...v){
        // By using ...v  we can paas as many integers as we can
        // Internally it takes as an array of integers

        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b , String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
    }
}
