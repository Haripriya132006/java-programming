import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        int current=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=input.nextInt();
        for(int  i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(current+" ");
                current++;
            }
            System.out.print("\n");
        }
        
    }
}
