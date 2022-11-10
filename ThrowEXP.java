import java.io.IOException;

public class ThrowEXP {
    public static void main(String[] args) {
        try{
            int x = 10;
            if(x>0)
            {
                throw new ArithmeticException("Invalid Number");
            }
            mythrowmethod();
        }
        catch (ArithmeticException e){
            System.out.println("Exception Throws");
        }
        catch (IOException e){
            System.out.println("Exception Throws");
        }

    }

    private static void mythrowmethod() throws IOException,ArithmeticException {
        System.out.println("Method Throws IOExpetion");
    }
}
