package polymorphism;

public class MethodOverloading {

public void add(int a, int b)
{
	System.out.println("Method 1:" +(a+b));
}

public void add(int a,int b,int c)
{
	
	System.out.println("Method 2:" +(a+b+c));
}

public void add(int a, double b)
{
	System.out.println("Method 3:" +(a+b));
}
	
public void add(double a, int b)
{
	System.out.println("Method 4:" +(a+b));
}
	
	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add(6,2);  //method 1
		obj.add(2,5,8); //method 2
	    obj.add(5,2.5 ); //method 3
		obj.add(2.5,3); //method 4
		
	}

}
