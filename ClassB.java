public class ClassB extends ClassA{
    private int b;

    public ClassB(){
        b=0;
    }
    public ClassB(int a,int b){
        super(a);
        this.b = b;
    }
    public void show(){
        System.out.println("Value of A in CLass B is "+getA());
        System.out.println("Value of B in CLass B is "+b);
    }

}
