import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int k = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = k++;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
