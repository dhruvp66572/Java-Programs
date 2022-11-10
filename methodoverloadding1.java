import java.security.PublicKey;

public class methodoverloadding1 {
    public void add(int x, int y)
    {
        System.out.println("Sum is " + (x+y));
    }
    public void add(double x, double y)
    {
        System.out.println("Sum is " + (x+y));
    }

    public static void main(String[] args) {
        methodoverloadding1 ob = new methodoverloadding1();
        ob.add(10,20);
        ob.add(10.20,10);
    }

}
