package Strings;

public class Replace_The_Occurance_Of_Letters_With_1_ANd_2 {
	
	/*
	 * Input= Oenheimer
	 * 
	 * ouput=O1nh2im3r
	 */
	
	public static void main(String[] args) {
		
		String data= "Oenheimer";
		
		char ch[]=data.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=1;j<ch.length;j++)
			{
				int count=1;
				if(ch[i]==ch[j])
				{
					ch[i]=String.valueOf(count).charAt(0);
					count++;
				}
			}
		}
		System.out.println(ch);
		
		
	}

}
