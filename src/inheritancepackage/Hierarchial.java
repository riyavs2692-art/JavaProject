package inheritancepackage;

class Mobile
{
	public void Mobilemethod()
	{
		System.out.println("Mobile class method");
	}
}
 class Samsung extends Mobile //inherit from class mobile
 {
	 public void samsungmethod()
	 {
		 System.out.println("Samsung method");  
	 }
 }
  class iphone extends Mobile
  {
	  public void iphonemethod()
	  {
		  System.out.println("Iphone method");
		  
	  }
  }
  

public class Hierarchial {

	public static void main(String[] args) 
	{
		Samsung obj=new Samsung();
		obj.Mobilemethod();
		obj.samsungmethod();
        iphone iphoneobj=new iphone();
        iphoneobj.Mobilemethod();
        iphoneobj.iphonemethod();
	}

}
