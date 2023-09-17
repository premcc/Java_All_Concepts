package Arrays;

public class Find_The_Longest_Length_Of_An_Array {
	
	/*
	 * Input String arr[]={"apple","Banana","cbjhbcsj","oxe"};
	 * 
	 * Output : cbjhbcsj
	 */
	
	public static void main(String[] args) {
		
		String arr[]= {"apple","Banana","cbjhbcsj","oxe"};
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()<arr[j].length())
				{
					String c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
			
			
						
		}
		System.out.println("The longest String is "+arr[0]);
		
	}

}
