public class ThreadDemo1 implements Runnable {
    Thread t;
    String tname;
    public ThreadDemo1(String s){
        t = new Thread(this);
        t.setName(s);
//        tname = s;
        t.start();
    }

    @Override
    public void run() {
//        System.out.println(tname);
        System.out.println(t.getName());
    }

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            ThreadDemo1 ob = new ThreadDemo1("Thread "+i);
        }
    }
}
