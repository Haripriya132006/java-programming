import java.util.Scanner;

public class code1 {

    
    public static int isprime(int number){
        int i=2;
       int factor=0;
       if (number<=3){
        return 1;
       }
       else{
        while(i<= number){
            if (number%i==0){
                if (factor>1){
                    return 0;
                }
                // System.out.println(i);

                factor++;
            }
            i++;
        }
        if (factor==1){
            return 1;
        }
    }
    return 0;
}
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.println("enter a number:");
       int number=input.nextInt();
       int countprime=0;

       System.out.println(" primenumbers in this range: ");

       for(int i=2;i <= number;i++){
         if (isprime(i)==1){
            System.out.println(i +" is prime ");
            countprime++;
         }
       }
       
       System.out.println("number of prime numbers "+countprime);
       if (countprime==0){
        System.out.println("no prime numbers");

       }


       }
    
    
}


