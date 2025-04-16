import java.util.*;
public class numToWords {
    public static String numbertoword(int num){
        if (num==1){
            return "one";
        }
        if (num==2){
            return "two";
        }
        if (num==3){
            return "three";
        }
        if (num==4){
            return "four";
        }
        if(num==5){
            return "five";
        }
        if (num==6){
            return "six";
        }
        if (num==7){
            return "seven";
        }
        if (num==8){
            return "eight";
        }
        if (num==9){
            return "nine";
        }
        return "";
    }

    public static String numbertowordtens(int num){

        if (num==2){
            return "twenty";
        }
        if (num==3){
            return "thirty";
        }
        if (num==4){
            return "fourty";
        }
        if(num==5){
            return "fifty";
        }
        if (num==6){
            return "sixty";
        }
        if (num==7){
            return "seventy";
        }
        if (num==8){
            return "eighty";
        }
        if (num==9){
            return "niney";
        }
        return "";
    }

    public static String numbertowordtentotwenty(int num){
        if (num==10){
            return "ten";
        }
        if (num==11){
            return "eleven";
        }
        if (num==12){
            return "twelve";
        }
        if (num==13){
            return "thirteen";
        }
        if (num==14){
            return "fourteen";
        }
        if (num==15){
            return "fifteen";
        }
        if (num==16){
            return "sixteen";
        }
        if (num==17){
            return "seventeen";
        }
        if (num==18){
            return "eighteen";
        }
        if (num==19){
            return "nineteen";
        }
        return "";
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number fron 0-10000");
        int n=input.nextInt();
        int  len;
        if (n==0){
            System.out.println("zero");
            return;
        }
        
        len=(int)Math.log10(n)+1;
        

        // System.out.println(len);
        if (len==1){
            System.out.println(numbertoword(n));

        }
        while (len>1){
            if (len==4){
                // System.out.println(n/(int) Math.pow(10,len-1));
                System.out.print(numbertoword(n/(int) Math.pow(10,len-1))+ " thousand ");
                n=n%(int) Math.pow(10,len-1);
                // System.out.println(n);
            }
            
            if (len==3){
                // System.out.println(n/(int) Math.pow(10,len-1));
                System.out.print(numbertoword(n/(int) Math.pow(10,len-1))+ " hundred and ");
                n=n%(int) Math.pow(10,len-1);
                // System.out.println(n);
            }

            if (len==2){
                //  n=n/(int) Math.pow(10,len-1);
                // System.out.println(n);
                if (n>=20){
                    System.out.print(numbertowordtens(n/(int) Math.pow(10,len-1)));
                    n=n%(int) Math.pow(10,len-1);
                    System.out.print(" "+numbertoword(n));

                }
                if (n>=10 && n<20){
                    System.out.print(numbertowordtentotwenty(n));

                }

            }
            len--;

        }
        
    }

    
}
