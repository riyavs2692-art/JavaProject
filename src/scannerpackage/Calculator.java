package scannerpackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
         a=sc.nextInt();
         b=sc.nextInt();
    		  System.out.println("Select an operation +,-,*,/");
    		  char e=sc.next().charAt(0);
    		  
    		  switch(e)
    			{
    			case '+': System.out.println(a+b);
    			break; 
    			
    			case '-' :System.out.println(a-b);
    			break ;
    			
    			case '*':System.out.println(a*b);
    			break; 
    			
    			case '/' :System.out.println(a/b);
    			break;
	}
	}
}
