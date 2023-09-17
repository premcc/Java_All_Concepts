package Strings;

public class Swap_The_Two_Words_Using_Strings {
	/*
	 * Input => Hellow World
	 * 
	 * output +> World Hellow
	 */
	
	public static void main(String[] args) {
		
		String data ="Java code";
		
		String split []=data.split(" +");
		String dataTrim=data.trim();
		System.out.println("dataTrim......"+dataTrim);
		for (String Words : split) {
			
			StringBuilder sb=new StringBuilder(Words);
			
			System.out.print(sb.reverse()+" ");
			
		}
		
	}

}
