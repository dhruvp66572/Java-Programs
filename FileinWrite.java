import java.io.FileWriter;

public class FileinWrite {
    public static void main(String[] args) {
        try {
            FileWriter myfileFileWriter = new FileWriter("dp.txt");
            myfileFileWriter.write("I am Creating Fisrt File....");
            myfileFileWriter.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }
    }
}
