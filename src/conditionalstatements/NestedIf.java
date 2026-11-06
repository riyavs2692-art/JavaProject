package conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		int age=10, weight=20;
		
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("Eligible"); //when the both conditions are true
			}
			else
			{
				System.out.println("Underweight");  //it will execute when condition is false			}
		    }
			
		}
		else
		{
			System.out.println("Not eligible"); //it will executes when first condition is false
		}
}
}