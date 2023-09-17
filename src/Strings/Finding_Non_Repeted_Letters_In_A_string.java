package Strings;

public class Finding_Non_Repeted_Letters_In_A_string {
	/*
	 * 
	 * Input = PPPremmm
	 * 
	 * output=re
	 */
	
	public static void main(String[] args) {
		
		
		String data="PPPrennbP";
		char ch[]=data.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j&&ch[i]==ch[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.print(ch[i]);
			}
		}
		
		
				 
	}
	

}
