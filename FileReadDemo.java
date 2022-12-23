import java.io.File;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("dp.txt");
            Scanner sc = new Scanner(myFile);

            System.out.println(sc.nextLine());
            sc.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }
    }
}
