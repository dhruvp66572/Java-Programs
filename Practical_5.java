public class Practical_5 {
    public static void main(String[] args) {
        int a = 10000;
        int b = 2000;
        int c = 3000;

        int max = (a>b?(a>c?a:(b>c?b:c)):(b>c?b:c));

        System.out.println(max);
    }
}
