package Exception_Handling;

public class Ex_1 {
	
	public static void main(String[] args) {
		
String Subjects []=new String [6];
		
		
		
		try {
			Subjects [6]="Sanskrit";
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception is caught");
		}
		
		
		
		
		try {
			Subjects [7]="Sanskrit";
		}
		catch (NullPointerException e) {
			System.out.println("Exception is caught");
		}
		finally
		{
			System.out.println("we get indexOutofBounds Exception but we are trying to catch nullpointer ");
		}
	}

}
