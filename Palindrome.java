import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number ");
        int num = sc.nextInt();
        int reverse_num = reverse(num);
        if (reverse_num == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }

    static int reverse(int num){
        int reverse_num = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                reverse_num = (reverse_num * 10) + digit;
            }
            num /= 10;
        }
        return reverse_num;
    }
}
