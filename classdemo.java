public class classdemo {
	private int x, y;
	public static int z;	
	public void classdemo(int x, int y)
	{
		this.x= x;
		this.y=y;
	} 
	public void classdemo(){} 
	public void setdata(int x1,int y1)
	{
		x=x1;
		y=y1;
	}
	public void getdata()
	{
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
    public static void trystatic()
    {
    	
    }
    public static void main(String[] args) {
	
	classdemo d = new classdemo();
	d.setdata(10,20);
	d.getdata();
	d.trystatic();
	
	System.out.print("Z = " + classdemo.z);
	//System.out.print(" " + );
	
    }
}
