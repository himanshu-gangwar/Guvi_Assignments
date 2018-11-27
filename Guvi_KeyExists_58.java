import java.io.*;
import java.util.*;

class Guvi_KeyExists_58
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int key,n,i,f=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the key u want to find");
		key=sc.nextInt();
		
				
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
