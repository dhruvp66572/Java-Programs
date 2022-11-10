// Write a program to find first n prime numbers
import java.util.Scanner;

public class Practical_4 {
    public static void main(String[] args) {
        int n = 10, s = 1, t = 2;
        boolean flag = false;

        while (s <= n) {
            for (int i = 2; i < Math.sqrt(t * t); i++) {
                if (t % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(t + " ");
                s++;
            }
            flag = false;
            t++;


        }
    }
}
