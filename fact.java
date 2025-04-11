import java.util.*;
public class fact {
    // public static int fact(int num){
    //     if (num==1 || num==0){
    //         return 1;
    //     }
    //     return num*fact(num-1);
    // }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int number1=input.nextInt();
        int number1Copy=number1;
        if (number1<0){
            System.out.println("negative number doesnt have a factorial");
            return;
        }
        int result=1;
        for(int i=1;i<=number1;i++){
            result*=i;
        }
        System.out.println("factorial : "+result);
        int count_zeros=0;
        int i=(int)Math.log10(result)+1;
        System.out.println(i);
        while (i>0){
            
            if (result%10==0){
                count_zeros++;
                System.out.println("next iteration");
                result/=10;
                System.out.println(result);
                i--;
            }
            else{
                System.out.println("number of zeros at the end " + (count_zeros));
                return;
            }
        }

        // System.out.println("factorial using  recursive function :"+fact(number1));
    }
    
}
