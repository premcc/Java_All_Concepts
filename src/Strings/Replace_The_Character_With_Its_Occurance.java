package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Replace_The_Character_With_Its_Occurance {
	
	/*
	 * Input= OPENTEXT
	 * 
	 * Output=OPEN1EX2
	 * 
	 */
	
	public static void main(String[] args) {
		
		String data="OPENTEXT";
		
		char ch[]=data.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]=1;
					ch[j]=2;
				}
			}
		}
		System.out.println();
		
		
	}

}
