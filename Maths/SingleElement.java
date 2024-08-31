public class SingleElement {
    public static void main(String[] args) {
         int[] arr = {2,3,4,3,6,2,4};
         System.out.println(ans(arr));
    }
    public static int ans(int arr[]){
        int xorr = 0;
        for(int i = 0 ; i < arr.length ; i++){
            xorr ^=arr[i];
        }
        // for(int n : arr){
        //     xorr ^= n ;
        // }
        return xorr;
    }
}
