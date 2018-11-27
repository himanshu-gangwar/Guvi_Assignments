import java.io.*;
import java.util.*;

class Guvi_NaturalSum_60
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int k,i,sum=0;
				
		System.out.println("Enter the value of k");
		k=sc.nextInt();
		
				
		for(i=1;i<=k;i++)
		{
			sum+=i;
		}
		
		System.out.println(sum);
		
	}
}
