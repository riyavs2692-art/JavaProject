package javapackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			a=a*i;
			
		}
		System.out.println(a);
	}

}
