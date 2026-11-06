package Constructorpackage;

public class Parameterizedconstructor {
	int age;
	String name;

	
	
		//accessmodifier classname(parameters){} =syntax to create a parameterized constructor
		public Parameterizedconstructor(int age,String name) 
		{
			
		this.age=age; //this.age refers to the instance variable
		this.name=name; //this.name refers to instance variable
		}
	//	public static void main(String[] args) 
		
		public void display()
		{
			System.out.println("Age="+age);
			System.out.println("name+="+name);
		}
		 
		
		public static void main(String[] args)
		{
			Parameterizedconstructor Parameterizedconstructorobj = new Parameterizedconstructor(10,"Jacob");
		}
	

	}


