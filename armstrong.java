import java.util.*;
//class is a user defined datatype .. mewww ^__^
public class armstrong {   //^v^ >v<
    public static int pow(int num,int exp){
        int power=1;
        while (exp>0){
            power*=num;
            exp--;
        }
        return power;
    }
    public static int length(int num){
        if (num==0){
            return 1;
        }
        else{
            return (int)Math.log10(num)+1;
        }
    }
    public static int armstrongNumber (int num,int length){
        int a =num;
        int result=0;
        while (a>0){
            result+=pow(a%10,length);
            a/=10;
        }
        if (num==result){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();

            for(int i=0;i<=num;i++){
                if( i==0){
                    System.out.println(i+" armstrong");
                }
                int length = (int) Math.log10(i) + 1;
                int finalRes=armstrongNumber(i, length);

                if (finalRes==1) {
                    System.out.println(i+" armstrong");
                }
            
        }
    }
}
