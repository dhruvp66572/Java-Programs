public class ThreadTutionP1 extends Thread{
    String tname;
    ThreadTutionP1(String s){
        tname = s;
        start();
        for (int i = 5; i >= 1; i--) {
            try{
                sleep(6000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            tname = "Thread "+ i;
            System.out.println(tname);
        }
    }

    public static void main(String[] args) {
        ThreadTutionP1 t1 = new ThreadTutionP1("Thread");
    }
}
