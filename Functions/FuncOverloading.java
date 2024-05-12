public class FuncOverloading {
    public static void main(String[] args) {
        fun(04);
        fun("Ayush");
        fun(3,4);
        int ans = sum(20,43);
        System.out.println(ans);
    }

    static void fun(int a){
        System.out.println(a);
    }


    static void fun(int d,int c){
        System.out.println(d);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum(int a , int b){
        return a + b;
    }
}

//When two or more functions have the same name but different arguments then it is called as function overloading
