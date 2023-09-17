package Date_handling;

import java.util.Date;

public class Println_Current_Date {
	
	public static void main(String[] args) {
		
		Date currentDate=new Date();
		
		System.out.println(currentDate);
		
		String newTimeStamp = currentDate.toString().replace(" ", "-").replace(":", "-");
		
		System.out.println(newTimeStamp);
	}

}
