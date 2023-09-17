package Numbers;

import java.util.Scanner;

public class Happy_Number {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		
		
		while(temp!=1&&temp!=4)
		{
			int sum=0;
			while (temp!=0) {
				
				int r=temp%10;
				sum=sum+r*r;
				temp=temp/10;
				
			}
			temp=sum;
			
			
			
		}
		if(temp==1)
		{
			System.out.println(num+" is an happy number");
		}
		else if(temp==4)
		{
			System.out.println(num+" is not an happy number");
		}
	}

}
