import Mypackage.mypack;

public class useofprotectedwithpackage extends mypack {

    public useofprotectedwithpackage()
    {
        super(100,200,300,400);
        System.out.println("A = "+a);
    }
    public static void main(String[] args) {
        useofprotectedwithpackage mp = new useofprotectedwithpackage();

        mp.show();

        System.out.println("A = "+mp.a);
    }

}
