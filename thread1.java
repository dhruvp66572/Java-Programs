class threadt1 extends Thread{
    public void run(){
        int i = 0;
        while (i<6){
            System.out.println("Good Morning !");
            i++;
        }
    }
}
class threadt2 extends Thread{
    public void run(){
        int i = 0;
        while (i<6){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Welcome....");
            i++;
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
    threadt1 t1 = new threadt1();
    threadt2 t2 = new threadt2();

    t1.start();
    t2.start();
    }
}
