package Strings;

public class Reverse_Each_Word_Of_String {
	
	/*
	 * input = "java code";
	 * output="avaj edoc";
	 */
	
	public static void main(String[] args) {
		
		String sb="java code";
		
		System.out.println("original "+sb);
		String arr[]=sb.split(" +");
		System.out.print("after reverse ");
		for (String word : arr) {
			
			String revWord="";
			
			for(int i=word.length()-1;i>=0;i--)
			
			{
				revWord=revWord+word.charAt(i);
				
			}
			System.out.print(revWord+" ");
		}
		
	}

}
