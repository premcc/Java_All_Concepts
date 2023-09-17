package Numbers;

import java.util.Scanner;

public class Automorphic_Number {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		
		int square=temp*temp;
		boolean res=false;
		while(num!=0)
		{
			if(num%10!=square%10)
			{
				res=true;
				break;
			}
			else
			{
				num=num/10;
				square=square/10;
			}
		}
		if(res==false)
		{
			System.out.println("Given number is automorphic");
		}
		else
		{
			System.out.println("Given number is not an automorphic number");
		}
	}

}
