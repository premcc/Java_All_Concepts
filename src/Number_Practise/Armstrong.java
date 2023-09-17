package Number_Practise;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    
    int num=sc.nextInt();
    int temp=num;
    int num1=num;
    int count=0;
    int sum=0;
    while(temp!=0)
    {
        count++;
        temp=temp/10;
    }
    
    while(num1!=0)
    {
        int r=num1%10;
        int v=1;
        for(int i=1;i<=count;i++)
        {
            v=r*v;
        }
        sum=sum+v;
        num1=num1/10;
        
    }
    if(num==sum)
    {
        System.out.println(num+" is an armstrong number");
    }
    else
    {
        System.out.println("It is not");
    }
    
}
}
