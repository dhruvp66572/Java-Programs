
public class test {

    static int count = 1; 
    int n;
    test(){
        n = count++;
    }
    
    public void show() {
        System.out.println(n+" Objects Are Created");
    }
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        test t3 = new test();
        test t4 = new test();
        t4.show();
    }
}