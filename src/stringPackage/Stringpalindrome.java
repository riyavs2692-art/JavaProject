package stringPackage;

import java.util.Scanner;

public class Stringpalindrome 
{
   public static void main(String[] args) 
	{
	
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      String s1=sc.nextLine();
      System.out.println(s1.contains("Morning"));
      
      //String s="Hello all";
     // Replace the word "all" with "everyone"
      
      String s2="Hello all";
      System.out.println(s2.replace("all", "everyone"));
	}

}
