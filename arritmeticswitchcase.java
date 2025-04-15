import java.util.Scanner;

public class arritmeticswitchcase {
    public static int switchcase(int num1,int num2 ,int operation){
        switch (operation){
            case(1):
            System.out.print("result of addition :");
            return num1+num2;
            // break;
            case(2):
            System.out.print("result of subtraction : ");
            return num1-num2;
            // break;
            case(3):
            System.out.print("result of multiplication : ");
            return num1*num2;
            // break;
            case(4):
            System.out.print("result of division :");
            return num1/num2;
            // break;
            default:
            System.out.print("invalid choice try giving from 1->5");
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("enter choice \n 1->add\n2->sub\n3->mul\n4->div\n 5->exit");
            int choice=input.nextInt();
            if (choice==5){
                System.out.println("exiting");
                break;
            }
            else{
                System.out.println("enter number1");
                int num1=input.nextInt();
                System.out.println("enter number2");
                int num2=input.nextInt();
                System.out.println(switchcase(num1, num2 ,choice));
            }
        System.out.println();    
        }
    }
}
