import java.util.*;

public class cuberoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        float num = input.nextFloat();

        float left = 0;
        float right = num;
        float mid = (left + right) / 2; // this parantheses is importantttttt!!!!
        // System.out.println(mid);
        int x = 0;
        
        if (x * x * x < num) {
            while (x * x * x < num) {
                x++;
            }
        }
        if (x * x * x == num) {
            System.out.println("perfect cube root " + x);
        } else {
            while (Math.abs(mid * mid * mid - num) > 0.00001) {
                if (mid * mid * mid > num) {
                    right = mid;
                    // System.out.println(right);
                    mid = (left + right) / 2;
                } else {
                    left = mid;
                    // System.out.println(left);
                    mid = (left + right) / 2;

                }
                // System.out.println(mid);
            }
            System.out.println("approximate cube root " + mid);

        }
    }

}
