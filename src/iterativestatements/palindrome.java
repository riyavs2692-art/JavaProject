package iterativestatements;

import java.util.Scanner;

public class palindrome 
{
public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in) ;
	{
	
		System.out.println("Enter a number" );
		int a=sc.nextInt();
		System.out.println("value of a= "+a);
		int rev=0;
		int rem;
		int temp=a;
		
		while(a>0)
		{
		rem=a%10; //123%10=3
		rev=(rev*10)+rem;  //0*10+3=3  3*10+2=32  32*10+1=321
		//System.out.print(rem);
		a=a/10; //123/10=12
		}
		System.out.println("The reversed value is " +rev);
		//System.out.println("value of a= "+a);
		if(temp==rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	   }
		//System.out.println("The reversed value :"+rev);
		//System.out.println("Value of a=" +a);
     }
}


