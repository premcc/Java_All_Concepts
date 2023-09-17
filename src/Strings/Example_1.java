package Strings;

public class Example_1 {
	
	public static void main(String[] args) {
		
		String s1="prem";
		
		String s3="prem";
		
		String s4=new String("prem");
		
		String s5=new String("prem");
		
		System.out.println(s1==s3);//it will give true because both s1 and s3 pointing the same literal in 
		                           //static constant pool area
		
		System.out.println(s1==s4);//it will give false because both are pointing to different literal
		
		System.out.println(s4==s5);//it will also give false
		
		System.out.println(s4.equals(s5));//it will give true because .equals method pointing to literal not place
		
		System.out.println(s1.equals(s5));//it will give true also
		/*
		in the above total three objects are created s1 and s4 and s5
		*/
		
	}

}
