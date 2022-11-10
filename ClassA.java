public class ClassA {
    private int a ;
    public ClassA(){
        a=0;
    }
    public ClassA(int a ){
        this.a = a;
    }
    public void show()
    {
        System.out.println("value Of a in CLassA is "+a);
    }
    public void setA(int a ){
        this.a = a;
    }
    public int getA(){
    return a;
    }
}
