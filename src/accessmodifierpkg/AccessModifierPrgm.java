package accessmodifierpkg;


public class AccessModifierPrgm {
	private int a = 10; //private variable
	int b = 15;   //default variable
	protected int c = 20; //protected variable
	public int d= 30; //public variable
	
	
	
	

	public static void main(String[] args)
	{
		AccessModifierPrgm obj=new AccessModifierPrgm();
		System.out.println("Private variable = "+obj.a);
		System.out.println("Default variable = "+obj.b);
		System.out.println("Protected variable = "+obj.c);
		System.out.println("Public variable = "+obj.d);
		
	}

}
