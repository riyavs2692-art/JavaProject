package accessmodifierpkg;

public class Sample {

	public static void main(String[] args)
	{
		AccessModifierPrgm obj=new AccessModifierPrgm(); //the variables are contained in this class
		//System.out.println("Private variable = "+obj.a); //can't access variable a because a is a private variable
		System.out.println("Default variable = "+obj.b);
		System.out.println("Protected variable = "+obj.c);
		System.out.println("Public variable = "+obj.d);
		
      
	}

}
