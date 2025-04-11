import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of elements");
        int noOfElements=input.nextInt();
        int[] list= new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            System.out.print("enter element "+(i+1)+ " ");
            list[i]=input.nextInt();
        }

        for(int i=0;i<noOfElements;i++){
            for(int j=0;j<noOfElements;j++){
                if(i!=j && list[i]==list[j]){
                    System.out.println("contains duplicates");
                    return;
                }
            }
        }
        System.out.println("no duplicates found");
        
    }
}
