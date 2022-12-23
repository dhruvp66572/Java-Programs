public class UserThreadJoinDemo {
    public static void main(String[] args) {
        JoinThread_Demo ob1 =new JoinThread_Demo("Producer");
        JoinThread_Demo ob2 =new JoinThread_Demo("Consumer");

        try {
            ob1.start();
            ob1.join();
            ob2.start();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
