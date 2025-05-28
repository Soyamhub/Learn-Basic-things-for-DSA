
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the two numbers you wwant to get GCD from");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("The brute force method answer "+ findGcd1(n1, n2));
        System.out.println("The better method answer "+ findGcd2(n1, n2));
        
    }

    public static int findGcd1(int n1, int n2) {
        // brute force method
        int gcd = 1;
        for (int i = 1; i < Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int findGcd2(int n1, int n2) {
        // better method
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
