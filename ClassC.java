public class ClassC extends ClassA {
    private int c;

    public ClassC(){
        c=0;
    }
    public ClassC(int a,int b){
        super(a);
        this.c = c;
    }
    public void show(){
        System.out.println("Value of A in CLass A is "+getA());
        System.out.println("Value of B in CLass B is "+c);
    }
}
