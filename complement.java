public class complement {
    public static void num_to_bin_5bit(int num, int[] result) {
        int[] array = { 16, 8, 4, 2, 1 };
        int i = 0;
        while (num != 0) {
            if (num >= array[i]) {
                num -= array[i];
                result[i] = 1;
                // System.out.println(num+" "+array[i]);
                i++;
            } else {
                i++;
            }

        }
        // System.out.println(result);
        for (int j = 0; j < array.length; j++) {
            System.out.print(result[j]);
        }
    }

    public static void onescomp(int[] result,int[] inversed){
        for(int i=0;i<inversed.length;i++){
            inversed[i]=  (result[i]==0)?1:0;
        }
        
        for (int j = 0; j < inversed.length; j++) {
            System.out.print(inversed[j]);
        }
    }

    public static void reversed(int[]result,int[]reversed){
        int me=0;
        for(int i=(result.length)-1;i>-1;i--){
            reversed[me]=result[i];
            me++;
        }
        for (int j = 0; j < reversed.length; j++) {
            System.out.print(reversed[j]);
        }
    }
    public static void main(String[] args){
        int num=15;
        
        int[] result= {0,0,0,0,0};
        num_to_bin_5bit(num,result);
        System.out.println("  mew");

        int[] inversed={0,0,0,0,0};
        onescomp(result, inversed);
        System.out.println("  mew");


        int[] reversed=new int[result.length];
        reversed(result, reversed);
        System.out.println("  mew");
        
    }
}
