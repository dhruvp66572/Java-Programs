public class thiskeyword {
    int x;
    private int y;
    thiskeyword(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void show()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        thiskeyword ob = new thiskeyword(10, 20);
        ob.show();
    }
}
