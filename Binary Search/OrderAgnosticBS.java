public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {-5,2,32,54,65,67,68,87,97,99};
        int target = 87;
        System.out.println(orderAgBS(arr,target));
        int arr2[] = {98,89,85,72,46,25,11};
        int target2 = 25;
        System.out.println(orderAgBS(arr2,target2));

    }

    public static int orderAgBS(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        // Find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];
        // if(arr[start]<arr[end]){
        //     isAsc = true;
        // }
        // else{
        //     isAsc = false;
        // }

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid]>target){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid]<target){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;  
    }
}
