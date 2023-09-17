package Collections;

public class Dupliocate_String_Remove {
	
	public static void main(String[] args) {
		
		String data="abcdafd";
		String newData="";
		char arr[]=data.toCharArray();

		for(int i=0;i<arr.length;i++)
		{

		int count=0;
		for(int j=i+1;j<arr.length;j++)
		{

		if(arr[i]==arr[j])
		{
		  count++;
		}

		}

		if(count==0)
		{
		newData=newData+arr[i];
		}
		}
		System.out.println(newData);
	}

}
