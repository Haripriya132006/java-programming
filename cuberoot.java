import java.util.*;
public class cuberoot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        float num=input.nextFloat();
        float left=0;
        float right=num;
        float mid=(left+right)/2; // this parantheses is importantttttt!!!!
        int a=0;
        float val=mid*mid*mid;
        while(val !=num || (val>num-0.001 && val< num+0.001) ){

            if (val >num && a<30){
                right=mid;
                System.out.println(right);
                mid=(left+right)/2;
                a++;
            }
            if (val <num && a<30){
                left=mid;
                System.out.println(left);
                mid=(left+right)/2;
                a++;
            }
            // return;

        }
        System.out.println(mid);

    }
}
