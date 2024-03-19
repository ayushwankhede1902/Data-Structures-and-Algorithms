import java.util.Scanner;
public class NestedSwitch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();

        String department = input.next();


        
        switch (empID){
            case 1:
            System.out.println("Ayush Wankhede");
            break;

            case 2:
            System.out.println("Om Wankhede");
            break;

            case 3 :
            System.out.println("Emp no 3");
            switch(department){
                case "Management":
                System.out.println("Management department");
                break;

                case "IT":
                System.out.println("IT department");
                break;

                default:
                System.out.println("No department");
            }
            break;

            default:
            System.out.println("Enter correct Employee ID");

        }   
    }
}
