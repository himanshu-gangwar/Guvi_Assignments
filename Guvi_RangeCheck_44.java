import java.io.*;

class Guvi_RangeCheck_44
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	int no;
	
	System.out.println("Enter the number you want to check for range");
	no=Integer.parseInt(in.readLine());
	
		
	if(no>=1&&no<=10)
		System.out.println("Yes");
					
	else
		System.out.println("No");
    } 
} 
