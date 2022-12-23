import java.io.*;
public class BufferReaderDemo {
    public static void main(String[] args) {
        InputStreamReader cin = null;
        BufferedReader br = null;
        String name;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name::");
            name = br.readLine();
            System.out.println(name);
        }catch(IOException e)
        {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}