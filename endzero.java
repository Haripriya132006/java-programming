import java.util.*;

public class endzero {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter number : ");
        int num1=input.nextInt();
        int count=0;
        for (int i=5;num1/i>=1;i*=5){
            count+=num1/i;
            }
        System.out.println("count of trailing zeros: "+count);
    }
}
