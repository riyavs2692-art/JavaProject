package arraypackage;

import java.util.Scanner;

public class largestnum {

	public static void main(String[] args) {
	
		int[] large= new int[3];
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int max = large[0];
		for(int i=1;i<3;i++)
			large[i]=sc.nextInt();
	}
	int biggest=0;
	{
	for(int i=0;i<3;i++)
	{
		int[] large = null;
		if(large[i]>biggest) {
			int[] large1;
			biggest=large[i];
			
		System.out.println("Largest number is " +biggest);
	}
	}
	}
}


