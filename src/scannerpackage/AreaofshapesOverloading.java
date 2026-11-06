package scannerpackage;

public class AreaofshapesOverloading {
	public void area(int a)
	{
	System.out.println("Area of square : " +(a*a));
	}
	public void area(int l,int b)
	{
	System.out.println("Area of rectangle : " +(l*b));
	}
	
	public void area(int a, double b)
	{
	System.out.println("Area of triangle : " +.5*a*b);
	}
	public static void main(String[] args) 
	{
		AreaofshapesOverloading obj=new AreaofshapesOverloading();
		obj.area(5);
		obj.area(5,3);
		obj.area(2,3.5);
	}
	

}
