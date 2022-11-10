abstract class shapee{
     void area(){
         System.out.println("This is Abstract Class Area Method");
     }

}
class tringle extends shapee
{
    int b=10,h=10;
    void area()
    {
        System.out.println("This is tringle Class Area Method");
        System.out.println(" Area OF Tringle is "+((b+h)/2));

    }
}
class square1 extends shapee
{
    int a=10;

    void area()
    {
        System.out.println("This is square Class Area Method");
        System.out.println(" Area OF square is "+(a*a));

    }
}
class circle1 extends shapee
{
    int r=100;
    void area()
    {
        System.out.println("This is circle Class Area Method");
        System.out.println(" Area OF circle is "+(2*3.14*r));

    }
}

public class shape1 extends shapee {
    public static void main(String[] args) {
        shape1 ob = new shape1();
        tringle ob1 = new tringle()    ;
        square1 ob2 = new square1()    ;
        circle1 ob3 = new circle1()    ;


        ob.area();
        ob1.area();
        ob2.area();
        ob3.area();
    }
}
