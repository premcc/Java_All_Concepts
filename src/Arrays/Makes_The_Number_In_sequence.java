package Arrays;

public class Makes_The_Number_In_sequence {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		arr[0]=12;arr[1]=32;arr[2]=2;arr[3]=72;arr[4]=12;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int c=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=c;
			}
		}
		System.out.print(arr+" ");
	}
}
