package Strings;

import java.util.Iterator;

public class Example2 {
	public static void main(String[] args) {
		
		StringBuffer data=new StringBuffer("0000123450000");
		System.out.println("origina number  "+data);
		System.out.println(data.length());
		//System.out.println(data.reverse());
		//System.out.println();
		System.out.println(data.charAt(4));
		String value="";
		for(int i=data.length()-1;i>=4;i--)
		{
			System.out.print(data.charAt(i));
			value=value+data.charAt(i);
		}
		System.out.println();
		
		for(int i=value.length()-1;i>=0;i--)
		{
			System.out.print(value.charAt(i));
		}
	}

}
