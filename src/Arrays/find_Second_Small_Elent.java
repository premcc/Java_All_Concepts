package Arrays;

public class find_Second_Small_Elent {
	
	
	public static void main(String[] args) {
		
		int arr[]= {12,23,45,657,98};
		int c=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					 c=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=c;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("second smallest number "+arr[1]);
	}

}
