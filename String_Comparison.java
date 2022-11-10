public class String_Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";
        String s4 = new String(s1);
        String s5 = new String("Hello");
        System.out.println(s4);
        System.out.println(s1.equals(s2));
        System.out.println("Hello".equals("World"));
        System.out.println(s1 == s2);
        System.out.println("Hello" == "Hello");
        System.out.println(s1.compareTo(s2));
        System.out.println("Hello".compareTo("World"));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("Helo".equalsIgnoreCase("Helooo"));
    }
}
