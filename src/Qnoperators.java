
public class Qnoperators {

	public static void main(String[] args) {
	
		System.out.println("SWAP");
		int a=20;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a after swaping=" + a);
		System.out.println("value of b after swaping="+b);
		
		
	
		if(a==b)
{ 
			System.out.println("The numbers are equal");
}
		else
		{
			System.out.println("The numbers are not equal");
		}
	int a1=55;
	int b1=70;
	if(a1<50 && a1<b1)
	{
		System.out.println("Both conditions are true");
	}
	else
	{
		System.out.println("Both conditions are not true");
	}
	
	int num=17;
	int secondDigit=num%10;
	System.out.println(secondDigit);

}
}


