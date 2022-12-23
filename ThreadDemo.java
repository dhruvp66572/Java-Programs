public class ThreadDemo extends Thread{
    String tname;
    public ThreadDemo(){
        tname = "Default Thread";
//        super("Default Thread");
        start();
    }
    public ThreadDemo(String s){
        tname = s;
//        super(s);
        start();
    }

    public void run(){
        System.out.println(tname);
        try {
            Thread.sleep(2000);

        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        ThreadDemo ob = new ThreadDemo();
        ThreadDemo ob1 = new ThreadDemo("Thread 1");
        ThreadDemo ob2 = new ThreadDemo("Thread 2");
//        ThreadDemo ob2 = new ThreadDemo("Thread 3");
//        ThreadDemo ob3 = new ThreadDemo("Thread 4");
    }
}
