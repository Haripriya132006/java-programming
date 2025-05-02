//direct recurssion - method calls itself

//indirect reccursion - has 2 methods where each other call the other 
// ->method1->method2|
// |method1<-method2<-

//tailed recurssion - reccursion at the end .. so no backtracking 

//head reccursion - recurssion at the start ->reverse of tailed recurssion
// .. so backtracking happens 

//Tree reccursion - branches like a tree from one to many .. ex->fibbonaci

//nested reccursion 

public class recurssion {
    public static void main(String[] args){
        // meaw(5); //initialization


        // System.out.println("for looppp");
        // for(int i=1;i<=10;i++){   /// Integer.MAX_VALUE
        //     System.out.println(i);
        // }


        // System.out.println("reccursion");
        // uptil(20546); /// the highest we can print without stack overflow is 20546


        // System.out.println("factorial : "+fact(5));


        // for(int i=0;i<10;i++){
        //     System.out.println(fibb(i));
        // }

        
        // System.out.println("sum of numbers from 1-10 : "+sumofnums(10));


        // int[] arr={1,2,3,4,5};
        // int len=arr.length;
        // System.out.println(sumofarr(arr, len-1));
        
        
        // String name="meaw meaw wow";
        // int len=name.length();
        // revstr(name, len-1);

        System.out.println(revString("meaw"));
        // System.out.println(gcd(12, 28));

    }
    public static void meaw(int count){
        if (count<1){   ///base condition 
            return ;
        }
        // System.out.println("meaw meawww " + count);
        meaw(count-1);   //iterationnn
        System.out.println("meaw meawww " + count);
    }

    public static void uptil(int num){
        if (num==0){
            return;
        }
        uptil(num-1);
        System.out.println(num);
    }

    public static int fact(int num){

        if(num==1 ||num==0){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }

    public static int fibb(int num){
        if ((num==1) || (num==0)){
            return num;
        }
        return fibb(num-1) + fibb(num-2);
    }
    
    public static int sumofnums(int num){
        if (num==1){
            return 1;
        }
        return num + sumofnums(num-1);
    }
    
    public static int sumofarr(int[] arr,int len){
        if(len==0){
            // System.out.println(arr[len]);
            return arr[len];
        }
        // System.out.println(arr[len]);
        return(arr[len]+sumofarr(arr, len-1));
    }

    public static void revstr(String name,int len){
        if(len<0){
            return;
        }
        System.out.print(name.charAt(len));
        revstr(name, len-1);
    }
    

    public static String revString(String input){
        if(input.isEmpty()){
            return input;
        }

        return revString(input.substring(1)) + input.charAt(0);
    }
    public static int gcd(int num1,int num2){
        if (num2 == 0) {
            return num1;
        }
        System.out.println("num1 ->"+num1+" num2 -> "+num2+" num1%num2 -> "+(num1%num2));
        return gcd(num2, num1 % num2);
    }
    // meaw

}
