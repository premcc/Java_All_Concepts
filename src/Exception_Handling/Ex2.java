package Exception_Handling;

import java.io.IOException;

public class Ex2 {
	
	public static void main(String[] args) {
		
		try
		{
			int arr[]=new int[2];
			arr[4]=234;
			int  a=arr[4];
			
		}
		catch(ArrayIndexOutOfBoundsException ec)
		{
			System.out.println("Exception found");
			
			
		}
		finally {
			System.out.println("Finally block will executed");
		}
		
	}

}
