import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char c = in.next().charAt(0);

        System.out.println("ASCII Value of " + c + " : " + (int)c);
    }
}
