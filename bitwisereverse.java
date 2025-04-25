public class bitwisereverse {

    public static void method1(int num,int bits,int output){
        for(int i=0;i<bits;i++){
            int last=num&1;
            if (output!=0){
                output=output<<1;
            }

            if(last==1){
                //d0nt have to check for 0 as left-shifting leads to 0 at the end alwaysss
                output=output|1;
            }
            num=num>>1;
        }
        System.out.println(output);
    }
    public static void main(String[] args){
        int num=10;
        int bits=4;
        int output=0;
        method1(num,bits, output);

        
}

}
