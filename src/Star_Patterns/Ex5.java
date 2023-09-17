package Star_Patterns;

public class Ex5 {
	
	
	/*
	 *  output= *******
	 *          ******
	 *          *****
	 *          ****
	 *          ***
	 *          **
	 *          *
	 *          
	 *          
	 *          
	 *          
	 *          
	 */      
	
	public static void main(String[] args) {
		
		int count=6;
		for(int i=0;i<=6;i++)
		{
			
			for(int j=count;j>=0;j--)
			{
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
	}

}
