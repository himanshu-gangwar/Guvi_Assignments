import java.io.*;
import java.util.*;

class Guvi_NoOfRepetition_57
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int key,n,i,c=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the key whose repetions u want to check in array");
		key=sc.nextInt();
		
				
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
				c++;
		}
		
		System.out.println(c);
	}
}
