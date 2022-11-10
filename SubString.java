public class SubString {
    public static void main(String[] args) {
        String s1 = new String("Hello World");
        char[] s2 = new char[11];
        try {
            s1.getChars(2, 4, s2, 0);
            System.out.println(s1);

        } catch (Exception e) {

        }
    }
}
