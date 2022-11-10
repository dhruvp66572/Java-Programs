public class String_Concate {
    public static void main(String[] args) {
        String s = "Hello", s1 = " World";

        String s3 = s.concat(s1);
        System.out.println(s3);
        System.out.println("Hello".concat(" World"));
        System.out.println(s1.concat(" Hello"));
        System.out.println(s + s1);
    }
}
