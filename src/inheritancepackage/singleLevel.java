package inheritancepackage;

class Parent    //parent class
{
	int a=5;
	public void parentmethod()
	{
		System.out.println("Parentmethod");
		
	}
}
class Child extends Parent  //child class which inherits the properties of class parent
{
  public void childmethod()
  {
	  System.out.println("Childmethod");
  }
}

public class singleLevel 
{

	public static void main(String[] args) 
	{
		Child obj=new Child();
		System.out.println("Value of A:"+obj.a);  //calling parent class variable using child class object
	    obj.parentmethod();//calling parent class method using child class object
	    obj.childmethod();
	}
	

}
