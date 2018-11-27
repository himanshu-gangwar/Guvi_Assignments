import java.io.*;

class Guvi_DigitsSum_53
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no,r,sum=0;

		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
	
		while(no!=0)
		{
			r=no%10;
			sum=sum+r;
			no=no/10;
		}
		
			System.out.println("Sum of digits is "+sum);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
