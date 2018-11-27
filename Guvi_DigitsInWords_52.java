import java.io.*;

class Guvi_DigitsInWords_52
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no;

		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
	
		String count[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		
		if(no>=1&&no<=10)
			System.out.println(count[no-1]);
		else
			System.out.println("Kindly enter between 1 and 10");
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
