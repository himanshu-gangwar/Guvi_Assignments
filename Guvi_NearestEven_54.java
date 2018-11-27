import java.io.*;

class Guvi_NearestEven_54
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no;

		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
	
			
		if(no%2==0)
			System.out.println(no);
		else
			System.out.println(no-1);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
