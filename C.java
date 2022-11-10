public class C extends B {
    private int c;
    public C(){
        System.out.println("In Class C");
    }
    public C(int a,int b,int c){
        super();
        this.c = c;
    }
    void show(){
        super.show();
        System.out.println("value of a in class C "+c);
    }

    public static void main(String[] args) {
        C c1 = new C(10,20,30);
        c1.show();
    }
}

