package String_Practise;

public class Interview_String_Pro2 {
	
	public static void main(String args[])
	{
		String arr[]= {"sukesh","chenchu","rangamma","surakamm","subbhamma"};
		String newArr[]=new String[3];
		int count=0;
		for(String str:arr)
		{
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(0)=='s'&&str.charAt(1)=='u')
				{
					newArr[count]=str;
					count++;
				}
			}
		}
		System.out.println("The new Array is "+newArr);

	}
	
}
