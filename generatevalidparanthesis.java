public class generatevalidparanthesis {
    public static void main(String[] args) {
        int n = 3;
        generate("", 0, 0, n);
    }

    static void generate(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            System.out.println(current);
            return;
        }

        if (open < max) {
            generate(current + "{", open + 1, close, max);
        }

        if (close < open) {
            generate(current + "}", open, close + 1, max);
        }
    }
}
