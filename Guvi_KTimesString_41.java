import java.io.*;

class Guvi_KTimesString_41
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	int i,k;

	System.out.println("Enter the string");
	str=in.readLine();
	
	System.out.println("Enter how many times fo you want to print it");
	k=Integer.parseInt(in.readLine());
	
		
	for(i=1;i<=k;i++)
		System.out.println(str);
					
		
    } 
} 
