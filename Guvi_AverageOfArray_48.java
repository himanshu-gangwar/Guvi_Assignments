import java.io.*;
import java.util.*;

class Guvi_AverageOfArray_48
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,sum=0;
		float avg;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
		
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
				
		}
		
		avg=(float)sum/n;		
		
		System.out.println("Average is "+avg);

	}
}
