package polymorphism;
 class Parent
 {
	 public void qualification()
	 {
		 System.out.println("BCA");
	 }
 }
 
 class Child extends Parent
 {
    @Override
	public void qualification() 
	{
		System.out.println("BTech");
		super.qualification();  //calling immediate parent class method
	}
	 
 }


public class MethodOverriding {

	public static void main(String[] args) 
	{
		
     Child obj=new Child();
    	 obj.qualification();
    	 
    	  
    	 //Parent obj1=new Parent();
    	 //obj1.qualification();
	}

}
