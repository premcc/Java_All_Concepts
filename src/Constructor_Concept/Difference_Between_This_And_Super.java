package Constructor_Concept;

public class Difference_Between_This_And_Super {
	
	
	
	public  Difference_Between_This_And_Super(int a,int b)
	{
		System.out.println("the sum of a and b is "+(a+b));
		
	}
	public  Difference_Between_This_And_Super(int a,int b,String data)
	{
		System.out.println("the sum of a and b is "+(a+b)+"  "+data);
		
	}
	
	   public  Difference_Between_This_And_Super()
	{
		this(20, 30);
	}
	   
	   public static void main(String[] args) {
		
		   Difference_Between_This_And_Super cp =new  Difference_Between_This_And_Super();
				  
		   
	}
	

}
