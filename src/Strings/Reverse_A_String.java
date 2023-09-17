package Strings;

public class Reverse_A_String {
	
	public static void main(String[] args) {
		
		String data ="premchand";
		System.out.println(data);
		StringBuilder sb=new StringBuilder(data);
		
		StringBuilder reverse=sb.reverse();
		System.out.println(reverse);
	}

}
