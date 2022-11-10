//copy cunstructor
//type of cunstructor
//demonstrate use of constructor
//passing object as argument
//default cunstructor
//overloded cunstructor
//perameterized cunstructor
//copy cunstructor
//use of this keyword
public class cunstuctorex {
    int x;

    public cunstuctorex()
    {
        System.out.println("Constuctor called");
    }

    public cunstuctorex(int x)
    {
        this.x = x;
    }

    public cunstuctorex(cunstuctorex ob)
    {
        x = ob.x;
    }

    public static void main(String[] args) {
        cunstuctorex ob1 = new cunstuctorex();
        cunstuctorex ob2 = new cunstuctorex(10);
        cunstuctorex ob3 = new cunstuctorex(ob2);
    }
}

