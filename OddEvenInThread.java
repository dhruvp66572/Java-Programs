public class OddEvenInThread extends Thread{
    String tname;
    OddEvenInThread(String s){
        tname = s;
        //start();
        if (tname.equals("Odd")){
            System.out.println(tname + " :- " );
            for (int i = 0; i < 50; i++) {
                if (i%2 == 0){
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println(tname + " :- " );
            for (int i = 0; i < 50; i++) {
                if (i%2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        OddEvenInThread o1 = new OddEvenInThread("Odd");
        OddEvenInThread o2 = new OddEvenInThread("Even");
    }
}