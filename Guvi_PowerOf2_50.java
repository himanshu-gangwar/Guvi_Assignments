import java.io.*;
import java.util.Scanner;

class Guvi_PowerOf2_50
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	int a;

	System.out.println("Enter the number");
	a=sc.nextInt();

	double lb2=Math.log(a)/Math.log(2);
	
	double temp=Math.ceil(lb2);

	if(lb2==temp)
		System.out.println("Yes");
	else
		System.out.println("No");

	}
}
