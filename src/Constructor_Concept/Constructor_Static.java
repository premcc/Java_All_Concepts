package Constructor_Concept;

public class Constructor_Static {
	
	
	   public Constructor_Static(int a,int b) {
		
		System.out.println(a+b);
		
	}
	{
		
	}
	public static void main(String[] args) {
		
		Constructor_Static cc=new Constructor_Static(23, 45);
		Constructor_Static cc1=new Constructor_Static(23, 95);
		System.out.println(cc.hashCode());
		System.out.println(cc1.hashCode());
		
		
	}

}
