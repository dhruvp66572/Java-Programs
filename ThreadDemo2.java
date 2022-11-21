public class ThreadDemo2 implements Runnable{
    Thread t;
    String tname;
    public ThreadDemo2(String s, int p){
        t = new Thread(this);
        t.setName(s);
//        tname = s;
        t.setPriority(p);
        t.start();
    }

    public synchronized void runcode() throws InterruptedException{
        if (t.getName().equals("Thread 1")){
            System.out.println("Thread 1");
            for (int i = 0; i < 10; i+=2) {
                System.out.println(i + "");
                Thread.sleep(2500);
            }
        }
        else if(t.getName().equals("Thread 2")) {
            System.out.println("Thread 2");
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i + "");
                Thread.sleep(5000);
            }
        }
        else{
            System.out.println("Thread 2");
            for (int i = 0; i < 10; i+=2) {
                System.out.println(i + "");
                Thread.sleep(5000);
            }
        }
    }

    public void run() {
//        System.out.println(tname);
        try {
            if (t.getName().equals("Thread 1")) {
                for (int i = 0; i <= 10; i+=2) {
                    System.out.println("Thread "+t.getName()+" "+i+" ");
                }
            }
            else
            {
                if (t.getName().equals("Thread 1")) {
                    for (int i = 0; i <= 10; i+=2) {
                        System.out.println("Thread "+t.getName()+" "+i+" ");
                    }
                }
            }
            Thread.sleep(1000);
//            System.out.println(t.getName() + "  Priority "+t.getPriority() );
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 ob = new ThreadDemo2("Thread 1",4);
        ThreadDemo2 ob1 = new ThreadDemo2("Thread 2",7);
    }
}
