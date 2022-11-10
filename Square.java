public class Square extends Shape{
    private float a;
    public Square(float a)
    {
        this.a = a;
    }
    public void show()
    {
        System.out.println("Area OF Square is "+(a*a));
    }
}
