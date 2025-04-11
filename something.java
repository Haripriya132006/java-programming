import java.util.*; //must if using scanner or other thingsss

public class something {
    public static void main(String[] args) {
        System.out.println("yeahh"); 
        Scanner input = new Scanner(System.in); //for input well seems the convention is to use input.close() to close the scanner but im too lazy meaw

        System.out.println("enter a number");
        int number1 = input.nextInt();

        System.out.println("entered number : " + number1);
        int number1Copy=number1;

        //to find the length of the numbers entered
        //one way to find length of a number is to change it to sting and using length function 
        // String num = String.valueOf(number1);
        // int length=num.length();

        // naext one is to use Math.log10(num)+1 .. its kinda cool tho .. 

        int length = (number1 == 0) ? 1 : (int)Math.log10(number1) + 1;

        int i=1;
        int last=length; 
        System.out.println("length : "+length);
        while (i<=length/2){
            int a=(int) (number1% 10);
            int b=(int)(number1Copy/Math.pow(10,last-1));
            System.out.println(a +" " + b);
            if (a!=b){
                System.out.println("not a palindrome");
                return ;
            }
            //changing num
            number1=number1/10;
            number1Copy= (int) (number1Copy% Math.pow(10,last-1)); //changing returned double to int .. as number1Copy is an intttt

            i++; //for iteration 
            last--; //power management i guess
            System.out.println("\n next iteration \n");
                }
        System.out.println("is a palindrome");
    }
    
}