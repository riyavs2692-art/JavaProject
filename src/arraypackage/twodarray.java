package arraypackage;

import java.util.Scanner;

public class twodarray {

	public static void main(String[] args)
	{
	//2x3 matrix
    //2 rows
	//3 columns
	    System.out.println("Enter the values");
		int[][]arr=new int[2][3];
//		arr[0][0]=5;//0th row,0th column
//		arr[0][1]=2;//0th row,1st column
//		arr[0][2]=1;//0th row,2nd column
//		arr[1][0]=8;//1st row,0th column

		Scanner sc= new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values are:");
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] +" ");
				
			}
			System.out.println();
			

	}
	}
}
