import java.util.*;

public class multi {
    public static void main(String[] args){
        Scanner input=new  Scanner(System.in);
        System.out.println("\nmultiplication without *\n");

        System.out.println("number 1:");
        int number1=input.nextInt();
        System.out.println("number 2 :");
        int number2=input.nextInt();

        int result=0;
        for(int i=0;i<number2;i++){
            result +=number1;
        }

        System.out.println("result");
        System.out.println(result);

        System.out.println("\ndividing and finding quotient without % \n");
        int count=0;
        if (number1<number2){
            System.out.println("reminder : "+number1);
            return ;
        }
        while(number1>0){
            number1-=number2;
        }

        System.out.println("reminder : "+number1);


    }
}
