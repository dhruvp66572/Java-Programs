public class Practical_6 {
    public static void main(String[] args) {
        int max2  = 0;
        int a = 1000;
        int b = 200;
        int c = 30;

        if (a > b && a > c) {
            max2 = b>c ? b : c;

        } else if (b > a && b > c) {
            max2 = a>c ? a : c;

        } else if (c > a && c > b){
            max2 = a>b ? a : b;
        }

        System.out.println(max2);
    }
}
