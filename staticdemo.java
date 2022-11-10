//wite a program to create class call student having student name , enrollno, age, and ontect number as class
//create instace method named getdata, showdata, compair age.
//create 3 instance of the class and demonstate use of methods

public class staticdemo {
    public void nonstatic(){
        System.out.println("Calling Non-static Method");
    }
    public static void staticmethod(){
        System.out.println("Calling static Method");
    }

    public static void main(String[] args) {
        staticdemo ob = new staticdemo();
        staticdemo.staticmethod();
        ob.staticmethod();
        ob.nonstatic();
    }
}
