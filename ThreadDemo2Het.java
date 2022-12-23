public class ThreadDemo2 implements Runnable{
    Thread t;
    static int count;

    public ThreadDemo2(String s, int p) {
        ThreadGroup tg1 = new ThreadGroup("One");
        t = new Thread(tg1, this, s);
        t.setPriority(p);
//        count = 0;
//        System.out.println(s + " " + p);
        t.start();
    }

    public /*synchronized*/ void runcode() throws InterruptedException {
        System.out.println(t.getName() + " Priority : " + t.getPriority());
            if (t.getName().equals("Thread 1")) {
                synchronized(this) {
                    count++;

                }
                for (int i = 1; i <= 10; i+=2) {
                    System.out.println(i + " " + t.getName() + " " + count);
                }
            } else {
                synchronized(this) {
                    count--;

                }
                for (int i = 2; i <= 10; i+=2) {
                    System.out.println(i + " " + count);
                }
            }
            System.out.println();
            Thread.sleep(1000);
    }

    public void run() {
        try {
            runcode();
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 t = new ThreadDemo2("Thread 1", 10);
        ThreadDemo2 t1 = new ThreadDemo2("Thread 2", 10);
    }
}
