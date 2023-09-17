package Constructor_Concept;

import java.util.ArrayList;

public class Registration_Form {
	
	public String  regId;
	
	public String name;
	
	public int age;
	
	
	public int annualIncome;
	
	
	public Registration_Form(String  regId,String name,int age,int annualIncome) {
		
		this.regId=regId;
		this.name=name;
		this.age=age;
		
		this.annualIncome=annualIncome;
		
		
		System.out.println("congratu;lations your successfully registred the application");
		
		
	}
	

}
