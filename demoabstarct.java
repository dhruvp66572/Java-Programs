public abstract class demoabstarct {
    private int x;
    private final int y = 10;

    void show()
    {
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }

    public abstract void modify_x();

    public static void main(String[] args) {

    }
}
