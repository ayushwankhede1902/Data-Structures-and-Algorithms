public class SetBits {
    public static void main(String[] args) {
        //int n = 9;
        //int count=0;
        //  Method 1
        // while(n>0){
        //     if((n & 1) == 1){
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        // System.out.println(count);

        // Method 2
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println((set(n)));
    }
    public static int set(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
