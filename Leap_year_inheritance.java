//import java.util.Scanner;
//
//public class Leap_year_inheritance {
//    int year;
//    Leap_year_inheritance(int year) {
//        this.year = year;
//    }
//}
//
//class test extends Leap_year_inheritance{
//    test(int year) {
//        super(year);
//    }
//    void show(){
//        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//        {
//            System.out.println("Leap Year");
//        }
//        else {
//            System.out.println("Non-Leap Year");
//        }
//    }
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter Year :: ");
//        test ob = new test(input.nextInt());
//
//        ob.show();
//    }
//}
//
//
