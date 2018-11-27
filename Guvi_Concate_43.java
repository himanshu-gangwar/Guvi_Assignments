import java.io.*;

class Guvi_Concate_43
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str,str1,rstr;

	System.out.println("Enter the first string");
	str=in.readLine();
	
	System.out.println("Enter the second string");
	str1=in.readLine();

	rstr=str+str1;
			
	System.out.println(rstr);
					
		
    } 
} 
