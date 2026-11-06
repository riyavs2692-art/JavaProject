package arraypackage;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the values:");
	 int sum=0;
	 int[]ar=new int[3];
	 for(int i=0;i<3;i++)
	 {
		 ar[i]=sc.nextInt();
	 }
	for(int v:ar)
	{
		System.out.print(v +"");
	}
	for(int i=0;i<3;i++)
	{
		sum=sum+ar[i];
	}
	System.out.println();
	System.out.println("The sum is:" +sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
