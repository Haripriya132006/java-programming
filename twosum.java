import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of elements");
        int noOfElements=input.nextInt();
        int[] list= new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            System.out.print("enter element "+(i+1)+ " ");
            list[i]=input.nextInt();
        }

        System.out.println("enter the target value");
        int target=input.nextInt();
        for(int i=0;i< noOfElements;i++){
            if (list[i]<target){
                for(int j=0;j<noOfElements;j++){
                    if(i!=j && list[i]+list[j]==target){
                        System.out.println("target "+target +" got by summing "+list[i]+" and "+list[j]);
                        return;
                    }
                }
            }
        }
    }
}
