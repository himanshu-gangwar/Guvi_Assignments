import java.io.*;

class Guvi_Alphanumeric_56
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
		
	int i,j,l,d=0,f=0;
	char ch;
	
	l=str.length();

	
	for(i=0;i<l;i++)
	{
		ch=str.charAt(i);
	
		if(Character.isDigit(ch))
			d=1;
		else if(ch>=65&&ch<=90)	
			f=1;
		else if(ch>=97&&ch<=122)	
			f=1;
		else
			f=1;
					
		
	}
	
	if(d==1&&f==1)
		System.out.println("Yes, Alphanumeric");
	else
		System.out.println("No");

    } 
} 
