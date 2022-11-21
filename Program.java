public class Program {
    int m=100, n=12, o;

    public static void passbyvalue(int k, int l){
        System.out.println("Pass By Value");
        System.out.println("A = "+k+" B = "+l);
        return;
    }
    static Program returnob1(Program p1){
        p1.o = p1.m + p1.n;
        return p1;
    }
    static int returnval(int x, int y){
        int ans;
        ans = x*y;
        return ans;
    }
    static void passbyref(Program obj){
        obj.o  = 100;
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        Program ob = new Program();
        Program ob2 = new Program();

        passbyvalue(100,200);
        passbyref(ob2);

        System.out.println("Ans = "+ob2.o);
        System.out.println("Ans = "+returnob1(ob));
        System.out.println("Ans = "+returnval(45,45));


    }
}
