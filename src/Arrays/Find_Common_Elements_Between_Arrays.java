package Arrays;

public class Find_Common_Elements_Between_Arrays {
	
	/*
	 * Input = 21,45,36,78,25,79
	 * 
	 * ouput= 22,45,37,77,20,79
	 */
	
	public static void main(String[] args) {
		
		int arr[]= {21,45,36,78,25,79};
		
		int arr2[]= {22,45,37,77,20,79};
		
		System.out.print("Common elements ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr[i]==arr2[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
