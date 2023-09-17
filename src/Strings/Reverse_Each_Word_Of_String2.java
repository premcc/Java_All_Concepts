package Strings;

public class Reverse_Each_Word_Of_String2 {
	public static void main(String[] args) {
		
		String str="java code";
				  String words[]=str.split(str);  
				    String reverseWord="";  
				    for(String w:words){  
				        StringBuilder sb=new StringBuilder(w);  
				        sb.reverse();  
				        reverseWord+=sb.toString()+" ";  
				    }  
				    System.out.println(reverseWord);
				     
				}  
				
		
	}
	


