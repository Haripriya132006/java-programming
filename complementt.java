public class complementt {
    public static void main(String[] args){
        int num = 4;
        int output1 = 0;

        for (int i = 0; i < 4; i++) {
            int last = num & 1;
            if(last==0){
                output1 = output1 | 1;
            }
            if (i < 3) output1 = output1 << 1;
            num = num >> 1;
        }

        // System.out.println("\n reversed Complemented value: " + output1);

        int output=0;
        bitwisereverse rev= new bitwisereverse();
        rev.method1(output1, 4, output);

    }
}
