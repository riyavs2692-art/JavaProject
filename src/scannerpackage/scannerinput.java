
package scannerpackage;

import java.util.Scanner;

public class scannerinput {
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Roll Number");
	int a=sc.nextInt();
	
	System.out.println("Enter Name");
	String n=sc.next();
	
	sc.nextLine();  //used when nextLine() is not working(enable to enter value through console
	
	System.out.println("Enter address");
	String ad=sc.nextLine();
	
	System.out.println("Grade");
	char g=sc.next().charAt(0);
	
	System.out.println("Height");
	double d=sc.nextDouble();
	
	System.out.println("Roll Number: "+a);
	System.out.println("Name: "+n);
	System.out.println("Address: "+ad);
	System.out.println("Grade: "+g);
	System.out.println("Height: "+d);
	
	
	
}

}
