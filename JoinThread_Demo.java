public class JoinThread_Demo extends Thread{
    private int[] a;
    private static String tname;
    public JoinThread_Demo(String t){
        tname = t;
        a = new int[10];
    }
    public void assignValue(){
        System.out.println("Assign");
        for (int i = 2; i < 3; i++) {
            a[i] = i * i;
        }
    }
    void Display(){
        System.out.println("Display");
        for (int i = 1; i < 3; i++) {
            System.out.println(a[i]);

        }
    }
    public void run(){
        if (tname.equals("Consumer"))
        {
            Display();
        }
        else
        {
            System.out.println("Called");
            assignValue();
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
