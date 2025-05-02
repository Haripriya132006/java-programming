class combination {
    public static void main(String[] args) {
        String input = "sam";
        boolean[] used = new boolean[input.length()];
        generatePermutations(input, "", used);
    }

    public static void generatePermutations(String input, String current, boolean[] used) {
        if (current.length() == input.length()) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (used[i]) continue;

            used[i] = true;
            generatePermutations(input, current + input.charAt(i), used);
            used[i] = false; // backtrack
        }
    }
}
