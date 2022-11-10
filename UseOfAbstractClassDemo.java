public class UseOfAbstractClassDemo extends AbstractClassDemo{

    public static void main(String[] args) {
        UseOfAbstractClassDemo ob = new UseOfAbstractClassDemo();
        ob.show_msg();

//        AbstractClassDemo ob1 = AbstractClassDemo();
    }

    public void show_msg()
    {
        System.out.println("Overrieded The Abstract Method");
    }


}
