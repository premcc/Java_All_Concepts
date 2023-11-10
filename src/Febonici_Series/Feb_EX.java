package Febonici_Series;

public class Feb_EX {
	
	public static void main(String args[])
	{
		int n1=21;int n2=22;int count=31;
		
		System.out.print(n1+" "+n2);
		
		for(int i=23;i<=31;i++)
		{
			int n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}
	}

}
