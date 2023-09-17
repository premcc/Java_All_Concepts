package Constructor_Concept;

import java.util.Scanner;

public class Reg_User extends Registration_Form {
	
	
	public Reg_User(String  regId,String name,int age,int annualIncome) {
		
		super(regId, name, age, annualIncome);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your registration id  :");
		
		
		System.out.println("_______________________________");
		String regId =sc.nextLine();
		System.out.println("Enter your registration name  :");

		System.out.println("_______________________________");
		
		String name =sc.nextLine();

		System.out.println("Enter your registration age  :");
		
		System.out.println("_______________________________");
		int age=sc.nextInt();
		
		
		System.out.println("Enter your registration annualIncome  :");

		System.out.println("_______________________________");
		
		int annualIncome=sc.nextInt();
		
		Reg_User reg=new Reg_User(regId,name,age,annualIncome);
	}

}
