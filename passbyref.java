public class passbyref {
        void swap(int  x, int y)
        {
            int temp = x;
            x = y;
            y = temp;
        }

        public static void main(String[] args) {
            int x = 10, y = 20;
            passbyvalue ob = new passbyvalue();

            System.out.println("Before Swap x = " + x + "  Y = " + y);

            ob.swap( x, y);

            System.out.println("\nAfter Swap x = " + x + "  Y = " + y);

        }

}
