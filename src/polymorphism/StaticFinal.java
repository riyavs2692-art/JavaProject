package polymorphism;

public class StaticFinal {
	int a=5;
	static String company="Luminar";
    final double pi=3.14;
    static final double pivalue = 3.14;
    
	public static void main(String[] args)
	{
	StaticFinal obj=new StaticFinal();
     System.out.println("Value of a : "+obj.a);
     
     System.out.println("Value of company  : "+company); //Company is static variable,  we can able to call it without the help of object
	 company="Luminar Technolab";
	 System.out.println("Updated value of company  : "+company); // the value of static variable can be updated
	  System.out.println("value of pi : "+obj.pi);
	 // obj.pi=5.25;Final variable cannot be updated or modified
	  
	  System.out.println("Vlue of pi value : "+pivalue); //variables declared using 'static final' keyword
	}
	

}
