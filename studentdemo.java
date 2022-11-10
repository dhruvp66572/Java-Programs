class student{
    String s_name;
    int s_roll, s_age, s_contectno;

    public void getdata(String name, int roll, int age, int contect){
        s_name = name;
        s_age = age;
        s_contectno = contect;
        s_roll = roll;
    }
    public void showdata(){
        System.out.println("Roll Number is " + s_roll);
        System.out.println("Name is " + s_name);
        System.out.println("Age is " + s_age);
        System.out.println("Contect Number is " + s_contectno);
    }

}
public class studentdemo {
    public static void main(String[] args) {
        student ob1 = new student();
        student ob2 = new student();
        student ob3 = new student();
        ob1.getdata("Dhruv",23,18,9999);
        ob2.getdata("sneh",14,19,8888);
        ob3.getdata("het",28,18,7777);
        ob1.showdata();
        ob2.showdata();
        ob3.showdata();
    }

}
