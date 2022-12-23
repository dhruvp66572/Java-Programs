public class static_variable {
        static int count = 0;
        static_variable(){
            count++;
        }
        public static void main(String[] args) {
           static_variable s1 = new static_variable();
           static_variable s2 = new static_variable();
           static_variable s3 = new static_variable();

            System.out.println(static_variable.count+"  Objects Are Created");
        }
}
