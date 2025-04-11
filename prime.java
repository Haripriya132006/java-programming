import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a = input.nextInt();
        int count = 0;
        boolean[] arr = new boolean[a + 1];

        for (int i = 0; i <= a; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= a; i++) {
            if (arr[i] == true) {
                System.out.println(i + " is prime");
                count++;
                for (int j = i*2; j <= a  ; j+= i) {
                    arr[j] = false;
                }
            }
        }

        System.out.println("the number of primenumbers " + count);

        input.close();
    }
}
