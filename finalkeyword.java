public class finalkeyword {
    final float pie = 3.14f;

    void show(int x)
    {
        System.out.println(pie*x*x);
    }

    public static void main(String[] args) {
        finalkeyword ob = new finalkeyword();
        ob.show(200);
    }
}
