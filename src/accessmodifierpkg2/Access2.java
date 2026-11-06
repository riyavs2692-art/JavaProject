package accessmodifierpkg2;

import accessmodifierpkg.AccessModifierPrgm;

public class Access2 extends AccessModifierPrgm { //access2 is the child class of AccessModifierPrgm 
     
	public static void main(String[] args)
	{
		Access2 obj = new Access2();
		//System.out.println("Private variable = "+obj.a); //a is private variable so it cannot be accessed here
		//System.out.println("Default variable = "+obj.b); //b is default variable so it cannot be accessed here
		System.out.println("Protected variable = "+obj.c);
		System.out.println("Public variable = "+obj.d);
	}

}
