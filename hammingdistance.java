public class hammingdistance {
    public static void main(String[] args){
        int a=11;
        int b=6;
        int count=0;
        for(int i=0;i<32;i++){
            int lasta= a&1;
            int lastb=b&1;

            // System.out.print(lasta);
            // System.out.print(lastb);
            // System.out.println();
            
            if(lasta!=lastb){
                count++;
            }
            a=a>>1;
            b=b>>1;
        }
        System.out.println(count);
    }
}
