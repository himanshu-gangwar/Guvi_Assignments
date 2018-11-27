import java.io.*;

class Guvi_DigitsCount_45
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no;
	
		System.out.println("Enter the number whose digits are to be evaluated");
		no=Integer.parseInt(in.readLine());
	
		String instr=Integer.toString(no);
	
		int c=instr.length();

		System.out.println("The number of digits in "+no+" are "+c);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
