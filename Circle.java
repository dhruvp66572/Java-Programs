public class Circle extends Shape{
    private float r;
    public Circle(float r)
    {
        this.r = r;
    }
    public void show()
    {
        System.out.println("Area OF Circle is "+(2*3.14*r));
    }
}
