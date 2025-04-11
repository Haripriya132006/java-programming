import java.util.*;

public class perfectnumber {

    public static int sumOfFactors(int num) {
        int result = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                result += i;
                result+=num/i;
            }
        }
        return result+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = input.nextInt();
        System.out.println(sumOfFactors(num));
        if (num == sumOfFactors(num)) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect number");
        }
    }
}
