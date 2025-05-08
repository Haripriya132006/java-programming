public class validipaddress {
    public static void main(String[] args) {
        String string = "1010123"; // Expected output: 10.10.1.23
        restore(string, "", 0, 0);
    }

    public static void restore(String string, String addr, int segment, int start) {
        if (segment == 4) {
            if (start == string.length()) {
                System.out.println(addr);
            }
            return;
        }

        for (int i = start; i < string.length(); i++) {
            String current = string.substring(start, i + 1);

            if (isSafe(current)) {
                restore(string, addr + (segment == 0 ? "" : ".") + current, segment + 1, i + 1);
            }
        }
    }

    public static boolean isSafe(String current) {
        if (current.isEmpty() || 
            current.length() > 3 ||  
            Integer.parseInt(current) > 255 || 
            (current.startsWith("0") && current.length() > 1)) {
            return false;
        }
        return true;
    }
}

//\\//\\             ^---^
//----\\             |0v0|
//O  O\\             |U_U|
// vv \\             |___|
//\\//\\
