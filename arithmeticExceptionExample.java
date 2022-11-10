public class arithmeticExceptionExample {
    public static void main(String[] args) {
        int no1,no2;
        try {
            no1 = 0;
            no2 = 100/no1;
            int a[] = {1,2,3};

            System.out.println(a[4]);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: Don't Divide A Number By Zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array Index is Out Of Bound");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Called");
        }
        System.out.println("Called Out Of try");
    }

}


