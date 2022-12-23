import java.io.File;

public class FileCreateDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("dp1.txt");
            if(myFile.createNewFile())
            {
                System.out.println(myFile + " File Created");
            }
            else
            {
                System.out.println("Some Error in Creating File....");
            }
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }  
    }
}
