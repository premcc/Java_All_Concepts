package Exception_Handling;

public class Use_Only_Try_Block_Without_Catch {
	
	public static void main(String[] args) {
		
		try
		{
			int a=20/0;
		}
		finally {
			System.out.println("Arthemetic exception found");
		}
	}

}
