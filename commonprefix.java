public class commonprefix {
    public static void main(String[] args) {
        String[] arr= {"flower","flow","fly"};
        method1(arr);  
    }

    public static void method1(String[] arr){      //order of n*n as nested loops are being usedddd
        int a=100000;
        String reference="";
        String common="";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<a){
                a=arr[i].length();
                reference=arr[i];
            }
        }
        // System.out.println(reference+" "+a);
        boolean ifcommon=true;

        for(int i=0;i<a;i++){
            char character=reference.charAt(i);
            for(int j=0;j<arr.length;j++){
                // String word=arr[j];
                if(arr[j].charAt(i)!=character){
                    ifcommon=false;
                }
            }
            if (ifcommon==true){
                common+=reference.charAt(i);
            }
            else{
                // System.out.println("no more common chars loop end");
                break;
            }
        }
        System.out.println(common);
    }
}
