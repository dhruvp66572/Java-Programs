// Write a program in java to reverse the digits of a number using while loop.

public class Practical_7 {
    public static void main(String[] args) {
        int num = 100101;
        int reverse = 0, digit = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println(reverse);
    }
}
