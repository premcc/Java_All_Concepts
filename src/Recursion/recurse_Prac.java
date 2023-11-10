package Recursion;

public class recurse_Prac {
	
	public static int rec(int value)
	{
		if(value>0)
		{
			return value+ rec(value-1);
		}
		else
		{
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		int result=rec(10);
		
		System.out.println(result);
		
		
		
	}

}
