package String_Practise;

public class Reverse_A_String {
	public static void main(String[] args) {
		
		String data="java";
		
		String rev="";
		
		for(int i=data.length()-1;i>=0;i--)
		{
			
			rev=rev+data.charAt(i);
		}
		System.out.println(rev);
		
		
	}

}
