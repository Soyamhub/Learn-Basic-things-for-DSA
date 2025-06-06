
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                reverse = (reverse * 10) + digit;
            }
            num /= 10;
        }
        System.out.println(reverse);
    }
}
