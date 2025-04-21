//overloading by varying the parameter numbersss...
//can change by parameter type .. parameter number .... and return type 
//return type didnt work this time but it shouldve worked aham 
public class polymorphism {
    public static void main(String[] args){
        int n1=20;
        int n2=30;
        System.out.println(cals(n1,n2));
        System.out.println(cals(n1));
        System.out.println(cals((float)n1,(float)n2));


    }
    public static int cals(int a,int b){
        return a+b;
    }
    
    public static int cals(int a){
        return a+a;
    }

    public static int cals(float a,float b){
        return (int)a*(int)b;
    }
    // public static void  cals(int a,int b){
    //     System.out.println(a+b);
    //     return;
    // }
}




