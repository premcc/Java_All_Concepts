package Strings;

public class To_Remove_Special_Characters_In_String {
	
	public static void main(String[] args) {
		
		String data="$$&&*katthi123@#NM";
		
		data=data.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(data);
		
	}

}
