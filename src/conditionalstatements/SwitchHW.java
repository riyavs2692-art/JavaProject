package conditionalstatements;

public class SwitchHW {

	public static void main(String[] args) {
       int  a=10,b=5;
       char c='%';
		
		switch(c)
		{
		case '+': System.out.println(a+b);
		break; 
		
		case '-' :System.out.println(a-b);
		break ;
		
		case '*':System.out.println(a*b);
		break; 
		
		case '/' :System.out.println(a/b);
		break;
		
		default: System.out.println("Invalid option");
		}

	}

}
