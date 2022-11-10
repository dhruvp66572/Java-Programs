package Mypackage;

public class mypack
{
    private int x;
    int y;
    protected int a;
    public int z;

    public mypack(){
        x = 0;
        y = 0;
        z = 0;
        a = 0;
    }

    public mypack(int x, int y,int z,int a)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
    }

    public void show()
    {
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z);
        System.out.println("A = "+a);
    }
}
