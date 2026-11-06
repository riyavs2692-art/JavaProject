package stringPackage;
import java.util.Scanner;
public class Wordreverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1="Java is simple and easy to learn";
		String[]result=s1.split(" ");
	
	    for(String v:result)
        {
           System.out.println(v);
        }
		String rev="";
		int index = result.length-1;
		for(int i= index;i>=0;i--) 
		{
		System.out.println("Reversed Sentence :");
		rev=rev+result[i]+" ";
		System.out.println(rev);
		}	
    }

}


