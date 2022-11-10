public class staticdemo1 {

    private int x;
    private static int y;
    public staticdemo1()
    {
        x++;
        y++;
    }
    public static int returny()
    {

        return y;
    }
    public int returnx()
    {

        return x;
    }
    public static void main(String args[])
    {
        staticdemo1 ob = new staticdemo1();
        System.out.println("Value of static y is : "+ob.returny());
        System.out.println("value of x is : "+ob.returnx());
        System.out.println("Value of y is : "+staticdemo1.returny());


        staticdemo1 ob1 = new staticdemo1();
        System.out.println("Value of static y is : "+ob1.returny());
        System.out.println("value of x is : "+ob1.returnx());
        System.out.println("Value of y is : "+staticdemo1.returny());

    }


}