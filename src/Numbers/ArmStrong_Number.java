package Numbers;

import java.util.Scanner;

public class ArmStrong_Number {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		int num1=temp;
		int count=0;
		int sum=0;
		while (temp!=0) {
			count++;
			temp=temp/10;	
		}
		while(num1!=0)
		{
			int r=num1%10;
			int j=1;
			for(int i=0;i<=count;i++)
			{
				j=j*r;
			}
			sum=sum+j;
			num1=num1/10;
		}
		if(num==sum)
		{
			System.out.println("it as an armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
	}

}
