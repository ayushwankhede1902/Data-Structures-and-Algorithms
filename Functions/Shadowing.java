public class Shadowing {
    static int x = 90; // this will bw shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // the class variable at line 2 is shadowed by this
        System.out.println(x); // 40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
