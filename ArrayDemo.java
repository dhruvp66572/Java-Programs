public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + sum/5);
    }
}
