package Constructor_Concept;

public class Calling_One_Class_Constructor_From_Another extends Difference_Between_This_And_Super {
	
	
	
	public Calling_One_Class_Constructor_From_Another(int a,int b,String day) {
		
		
		super(90,98,"baby");
	}
	
	public Calling_One_Class_Constructor_From_Another() {
		super();
	}

	public static void main(String[] args) {
		
		
		
		Calling_One_Class_Constructor_From_Another po=new Calling_One_Class_Constructor_From_Another();//output: the sum of a and b is 50
		
		Calling_One_Class_Constructor_From_Another po1=new Calling_One_Class_Constructor_From_Another(50,60,"prem");//the sum of a and b is 188  baby
		
	}
	
	

}
