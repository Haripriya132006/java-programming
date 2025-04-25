import java.util.HashMap;

public class longestpossiblesubstring {
    public static void method1(String word) {
        int max = 0;
        String longest = "";
    
        for (int i = 0; i < word.length(); i++) {
            StringBuilder sub = new StringBuilder();
    
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
    
                if (sub.indexOf(String.valueOf(c)) != -1) {
                    break; // duplicate found, break out of inner loop
                }
    
                sub.append(c);
    
                if (sub.length() > max) {
                    max = sub.length();
                    longest = sub.toString();
                }
            }
        }
    
        System.out.println("max (brute force) " + max);
        System.out.println("substring: " + longest);
    }

    public static void method2(String word){
        //optimized hashmap method ..
        int max=0;
        int left=0;

        HashMap<Character,Integer> position = new HashMap<>();

        for(int right=0;right<word.length();right++){
            char current=word.charAt(right);

            if(!position.containsKey(current)){
                position.put(current,right);
            }
            else{
                left=Math.max(left,position.get(current)+1);
                position.put(current,right);
            }
            max=Math.max(max,(right-left)+1);

        }
        System.out.println("max "+max);

    }
    public static void main(String[] args){
        String word="meaewww";
        method1(word);
        method2(word);
    }
}
