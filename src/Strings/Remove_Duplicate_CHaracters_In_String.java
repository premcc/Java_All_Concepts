package Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove_Duplicate_CHaracters_In_String {
	
	public static void main(String[] args) {
		
    String data="programming";
    
    String newstr="";
    for(int i=0;i<data.length();i++)
    {
    	int count=1;
    	for(int j=i+1;j<data.length();j++)
    	{
    		
    		if(data.charAt(i)==data.charAt(j))
    		{
    			count++;
    			break;
    		}
    		
    	}
    	if(count==1)
		{
			newstr=newstr+data.charAt(i);
			
		}
    }
	
    System.out.println(newstr);	
	}
	

}
