

public class StringBufferdemo{
	
    public static void main(String[] args) {
	
	//Constructor
	StringBuffer sb = new StringBuffer();
	StringBuffer sb1 = new StringBuffer("JAVA");
	StringBuffer sb2 = new StringBuffer(512);
	
	//Capacity
	System.out.println(sb.capacity());
	System.out.println(sb1.capacity());
	System.out.println(sb2.capacity());
	
	//Length
	System.out.println(sb.length());
	System.out.println(sb1.length());
	System.out.println(sb2.length());
	
	//Append() --> append String, String litters, numberic Values.
	String s1 = "My Java Hello Hello";
	int n = 10;
	sb.append(s1);
	sb.append(n);
	System.out.println(sb);
	System.out.println(sb1.capacity());
	System.out.println("Length :- " + sb2.length());
	
	sb2.append(sb);
	System.out.println(sb2);
	
	
	//Insert (Position, Value)
//	sb.insert(2, sb.length);
	sb.insert(2, "My Java");
  	
  
    }
}
