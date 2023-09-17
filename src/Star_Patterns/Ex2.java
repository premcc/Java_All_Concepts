package Star_Patterns;

public class Ex2 {
	
	/*
	 *    ******
	 *    *****
	 *    ****
	 *    ***
	 *    **
	 *    *
	 */
	
	public static void main(String[] args) {
		int count=4;
		for(int i=0;i<=4;i++)
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
