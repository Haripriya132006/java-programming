import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of day");
        int day=input.nextInt();
        switch(day){
            case(1):
                System.out.println("monday");
                break; 
            case(2):
                System.out.println("tuesday");
                break;
            
            case(3):
                System.out.println("wednesday");
                break;
            
            case(4):
                System.out.println("thursday");
                break;
            
            case(5):
                System.out.println("friday");
                break;
            
            case(6):
                System.out.println("saturday");
                System.out.println("holiday");
                break;
            
            case(7):
                System.out.println("sunday");
                System.out.println("holiday");
                break;
            
            default:
                System.out.println("invalid day number give btwn 1-7");
                break;
            
        }
        input.close();
    }
}
