import java.io.*;

public class ReadData {
    public static void main(String[] args) throws  IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        int[] a = {10,20,30,40,50};

        try {
            out  = new FileOutputStream("data.txt");

            int c;
            for (c = 0; c < a.length; c++) {
                out.write(a[c]);
            }
            out.close();
            in = new FileInputStream("data.txt");
            while ((c = in.read()) != -1)
             {
                 System.out.println(c);
             }
            in.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
