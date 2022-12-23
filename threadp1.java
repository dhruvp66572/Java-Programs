public class threadp1 extends Thread{
    String tname;
    public threadp1(String s){
        tname = s;
        // start();
        if (tname.equals("Thread 1")){
            try {
                Thread.sleep(1000);
                System.out.println(tname);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        else {
            try {
                Thread.sleep(4000);
                System.out.println(tname);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        threadp1 p1 = new threadp1("Thread 1");
        threadp1 p2 = new threadp1("Thread 2");
    }
}
