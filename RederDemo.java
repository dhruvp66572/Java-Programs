import java.io.*;
public class RederDemo {

    public static void main(String[] args) {
        try{
            Writer fw =  new FileWriter("a.txt");
            fw.write("My Name is DP");
            fw.close();
            int ch;
            Reader fr = new FileReader("a.txt");
            while ((ch = fr.read()) != -1){
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        } catch (IOException e)
        {
            System.out.println(e);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
