final class finaldemo {
    private final double PI = 3.14;
    public finaldemo() {
       //PI = 22; //Error We can't Modify Final Method
    }
    public final void show()
    {
        System.out.println("pi = "+PI);
    }
    public final void show(int x)
    {
        System.out.println("PI = "+PI);
        System.out.println("X = "+x);
    }

    public static void main(String[] args) {
        finaldemo ob = new finaldemo();
        ob.show();
    }
}
