import java.util.Scanner;

public class oddorevenbitwise {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        if((num&1)==1){
            System.out.println("odd");
        }
        else{           //((num & 1)==0)
            System.out.println("even");
        }
    }
}
