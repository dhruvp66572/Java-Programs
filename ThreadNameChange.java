public class ThreadNameChange extends Thread {
    String tname;

    ThreadNameChange(String s){
        tname = s;
        start();
        System.out.println(tname);
        if (tname.equals("Hello")){
            try{
                sleep(5000);
                tname = "World";
                System.out.println(tname);
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        ThreadNameChange t1 = new ThreadNameChange("Hello");
    }
}
