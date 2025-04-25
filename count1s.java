public class count1s {
    public static void main(String[] args){
        int num=10;
        int count=0;
        for(int i=0;i<32;i++){
            int last=num&1;
            // System.out.print(last);
            if(last==1) count++;
            num=num>>1;
        }
        System.out.println(count);
    } 
}
