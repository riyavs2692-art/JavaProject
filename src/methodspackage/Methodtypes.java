package methodspackage;

public class Methodtypes {

	public static void main(String[] args) {

     Methodtypes obj = new Methodtypes();
     int result=obj.add(3,2); //the variable result will store
     System.out.println("Sum is "+result);
      
     obj.sub();  //calling the method subtraction
     
     obj.multi(10, 5); //calling method multi and passing parameters
     
     int value=obj.div(); //calling method divand store the value to a variable
     System.out.println("Division:" +value);
     
     }
	
	               //methods
	//method with parameter and return type
	public int add(int a,int b)
	{
	  return a+b; //the value will be return from here
	}
	
	//method without parameter and without return type
	int x=11,y=5;
	  public void sub()
		{
		 System.out.println("Subtraction :" +(x-y));
		}

	//method with parameter and without return type
		public void multi(int a, int b)
		{
			System.out.println("Multiplication  :"+(a*b));		
		}
		
	//method without parameter and with return type
		public int div()
		{
			return x/y;
		}	
		}

