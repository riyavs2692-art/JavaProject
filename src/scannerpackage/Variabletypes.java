package scannerpackage;
public class Variabletypes {
	
	int a;  //instance variable
	int b=5; //instance variable
	static int c=10; //static variable
	
	public void display()
	{
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);
		 
		int x=15; //local variable
		System.out.println("x=" +x);
	}
	
   public static void main(String[] args) 
	{
	   Variabletypes obj=new Variabletypes(); //object declaration
       obj.a=2; //assigning value to instance variable
       obj.display();  //calling method using object
       
       System.out.println("The value of instance variable = " +obj.b); //calling instance variable with the help of object")
       System.out.println("The value of static variable is = " +c); //calling static variable
	   //System.out.println(obj.x); //x is a local variable , we cannot call it outside display() mathod
	 }
}
 