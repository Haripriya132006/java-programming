public class longestpalindrome {

    public static void frontpal(int start,int end,String word){
        String left_common="";
        String right_common="";
        while(start<end){
            if (word.charAt(start)==word.charAt(end-1)){
                System.out.println("okay word matched so next iteration ");
                left_common+=word.charAt(start);
                if (start != end-1) {  
                    right_common += word.charAt(end - 1);
                }
                start++;
                end--;
                System.out.println(start);
                System.out.println(end);
            }
            else{
                System.out.println("word not matched so end is reducedd");
                end--;
                System.out.println(end);
            
            }
        }
        String right_reversed = new StringBuilder(right_common).reverse().toString();
        System.out.println(left_common+right_reversed);
    }

    // public static void midpal(int start,int end,String word)

          //ba.ab
    public static void main(String[] args){

        String word="bacab";
        char[] finalone=new char[word.length()];

        for(int i=0;i<word.length();i++){
            finalone[i]=' ';
            System.out.print(finalone[i]);
        }
        
        int end=word.length();
        int start=0;
        // frontpal(start, end, word);
        // System.out.println(word.length());
        if (word.length()%2!=0){
            int mid=(int)start+end/2;
            finalone[mid]=word.charAt(mid);
            int i=1;
            while(mid+i<=end-1 || mid-i>=start){
                System.out.println("came inside while loop");
                if(word.charAt(mid+i)==word.charAt(mid-i)){    
                              
                    finalone[mid+i]=word.charAt(mid+i);
                    finalone[mid-i]=word.charAt(mid-i);
                    i++;
                    continue;
                }
                break;
                }
        }
        for(int i=0;i<word.length();i++){
            if(finalone[i]!=' '){
                System.out.print(finalone[i]);
            }
            
        }
        

        
}

}