import java.util.*;
public class FactorsOptimized {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 20;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.println(i + " ");
                }
                else{
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }
    
}
