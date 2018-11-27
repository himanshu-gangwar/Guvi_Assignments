import java.io.*;

class Guvi_DigitsDisplay_51
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int no,i;
		char ch;
	
		System.out.println("Enter the number");
		no=Integer.parseInt(in.readLine());
	
		String instr=Integer.toString(no);
	
		int c=instr.length();
		
		for(i=0;i<c;i++)
		{
			ch=instr.charAt(i);
			System.out.print(ch+" ");
		}

		System.out.println();
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
