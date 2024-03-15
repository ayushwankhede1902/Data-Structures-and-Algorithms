
public class if_else {
    public static void main(String[] args) {
        /*
         Syntax of if statements:
         if (boolean expression T or F){
            //body
         } else{
            //do this
         }
         */
        int salary = 25400;
        if(salary >10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println(salary); 

        //multiple if else statements
        int a = 38000;
        if (a > 15000){
            a += 2000;
        }
        else if (a >20000){
            a += 3000;
        }
        else{
            a +=1000;
        }
        System.out.println(a);

    }
} 
