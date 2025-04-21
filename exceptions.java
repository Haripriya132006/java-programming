public class exceptions {
    public static void main(String[] args){
        int a=24;
        int b=1;
        try{
            int n=a/b;
            System.out.println(n);
        }
        catch(ArithmeticException e){
            System.out.println("zero ala lam divide pana matten po");
        }
        finally{
            System.out.println("yevalo velai vekuran parunga");
        }
    }
    
}
