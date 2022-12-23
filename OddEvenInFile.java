import java.io.*;

public class OddEvenInFile {

    public static void main(String[] args) throws  IOException{
        FileInputStream in = null;

        FileOutputStream odd = null;
        FileOutputStream even = null;
        FileOutputStream out = null;

        try {
            out  = new FileOutputStream("data.txt");

            int c = 0;
            for (c = 0; c < 100; c++) {
                out.write(c);
            }
            out.close();
            in = new FileInputStream("data.txt");
            for (int i = 0; i < 100; i++) {
                if(in.read()%2 == 0){
                    even.write(i);
                }
                else
                {
                    odd.write(i);
                }
            }



            while ((c = in.read()) != -1)
            {
                System.out.println(c);
            }
            in.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(Exception e){
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
