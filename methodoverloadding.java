public class methodoverloadding {
    public void show(){
        System.out.println("Hello With No Message");
    }
    public void show(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        methodoverloadding ob = new methodoverloadding();

        ob.show();
        ob.show("World");
    }
}
