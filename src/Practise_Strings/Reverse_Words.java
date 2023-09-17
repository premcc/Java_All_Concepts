package Practise_Strings;

public class Reverse_Words {
	
	/*
	 * Input=welcome to java 
	 * 
	 * output=java to welcome
	 */
	
	public static void main(String[] args) {
		
		String s="Welcome to java";
		
		String []data=s.split(" +");
		String []mata=s.split(" ");
		
  for(int i=mata.length-1;i>=0;i--)
  {
	  System.out.print(mata[i]+" ");
  }
		
		
	}

}
