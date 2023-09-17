package Star_Patterns;

public class Ex4 {
	
	/*
	 *  1
	 *  12
	 *  123
	 *  1234
	 *  12345
	 */
	
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++)
		{
			int count=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(count);
				
				count++;
			}
			
			System.out.println();
		}
	}

}
