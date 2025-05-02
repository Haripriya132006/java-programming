public class changeinstr {
    public static void main(String[] args) {
        String s1 = "meaw";
        String s2 = "maeaw";

        int minLength = Math.min(s1.length(), s2.length()); 

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int xorResult = c1 ^ c2;

            if (xorResult != 0) {
                System.out.println("Different at index " + i + ": " + c1 + " of s1 to ->" + c2 + " -> XOR: " + xorResult);
                break;
            }
        }

        // If s2 is longer, the extra character is the difference
        if (s1.length() != s2.length()) {
            char extraChar = s2.charAt(s1.length()); // Capture the extra character from s2
            System.out.println("The extra character in s2 is: " + extraChar);
        }
    }
}
