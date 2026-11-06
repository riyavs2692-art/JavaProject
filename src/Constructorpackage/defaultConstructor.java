package Constructorpackage;

public class defaultConstructor 
  {
	int age;
	String name;

public static void main(String[] args) 
 {
	defaultConstructor obj=new defaultConstructor(); //defaultConstructor();-it is a default constructor without parameter
	obj.display();
 }
public void display()
{
	System.out.println("Age="+age); //age=0 because it act as default constructor
	System.out.println("Name="+name);//name=null it act as default constructor
}
 }