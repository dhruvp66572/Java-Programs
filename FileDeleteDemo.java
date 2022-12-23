import java.io.File;

public class FileDeleteDemo {
    public static void main(String[] args) {
        File myFile = new File("dp.txt");
        try {
            if(myFile.delete())
            {
                System.out.println(myFile + " File Deleted");
            }
            else
            {
                System.out.println("Some Error in Deleting File....");
            }
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }  
    }
}
