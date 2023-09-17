package String_Practise;

public class Remove_Duplicate_Characters {
	
	public static void main(String[] args) {
		
		String data ="programming";
		String dup="";
		char arr[]=data.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
		int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
		 count++;
		}

		}
		if(count==1)
		{
		dup=dup+arr[i];
		}
		}
		System.out.println(dup);
	}

}
