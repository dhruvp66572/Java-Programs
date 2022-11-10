public class privateconstructor {
    static int count = 0;
    private privateconstructor(){
        count++;
    }

    void show()
    {
        System.out.println(count);
    }

    public static void main(String[] args) {
        privateconstructor ob1 = new privateconstructor();
        privateconstructor ob2 = new privateconstructor();
        privateconstructor ob3 = new privateconstructor();
        ob1.show();
    }
}
