package Strings;

public class REmoving_White_Spaces {
	
	public static void main(String[] args) {
		
		String e="i like java very much";
		
		e=e.replaceAll("\\s", "");
		System.out.println(e);
	}

}
