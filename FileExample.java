import java.io.*;
import java.util.*;

public class FileExample {
    public static void main(String[] args) {
        
        //Creat New file
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


        //Write in File
        try {
            FileWriter myfileFileWriter = new FileWriter("dp.txt");
            myfileFileWriter.write("I am Creating Fisrt File....");
            System.out.println("Writing Completed");
            myfileFileWriter.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }


        //Reading File
        try {
            File myFile = new File("dp.txt");
            Scanner sc = new Scanner(myFile);

            System.out.println(sc.nextLine());
            System.out.println("Reading Completed");
            sc.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }
        

         //Modify in Exixt File
         try {
            FileWriter myfileFileWriter = new FileWriter("dp.txt");
            myfileFileWriter.write("Now, This is Modified File....");
            System.out.println("Modified Completed");
            myfileFileWriter.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }
    

         //Reading File
         try {
            File myFile = new File("dp.txt");
            Scanner sc = new Scanner(myFile);

            System.out.println(sc.nextLine());
            System.out.println("Reading Completed");
            sc.close();
        } catch (Exception e) {
            System.out.println("Error..... "+e);
        }
    }
}
