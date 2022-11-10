public class Practical_8 {
    public static void main(String[] args) {
        int a = 100;
        int units = 1;
        int tens = 10;
        int hundreds = 100;
        int thousands = 1000;

        int temp = a, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        System.out.println(count);
    }
}
