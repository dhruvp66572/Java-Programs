public class ClassABC {
    public static void main(String[] args) {
        ClassA ob;

        ob = new ClassB(10,20);
        ob.show();

        ob = new ClassC(30,40);
        ob.show();
    }
}
