package Arrays;

public class Serch_The_Number_In_A_Sequence {
	
	public static void main(String[] args) {
		
		int arr[]= {20,30,40,50,90};
		
		int searchNumber =90;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchNumber)
			{
				System.out.println("number found in a sequence");
				break;
			}
		}
	}

}
