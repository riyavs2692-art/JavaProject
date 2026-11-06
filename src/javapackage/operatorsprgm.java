package javapackage;

public class operatorsprgm {

	public static void main(String[] args) {
		System.out.println("Arithmetic operators");
		int a=5;
		int b=3;
	    System.out.println(a+b);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b); //5/3=1 is quotient
	    System.out.println(a%b); //5%3=2 is reminder
	    
	    System.out.println();
	    
	    System.out.println("Assignment operators");
	    //a=b; the value of b will be stored to a;
	    System.out.println(a+=b); //a=a+b; a=5+3=8,the updated value of a=8
	    System.out.println(a-=b); //a=a-b; a=8-3=5, the updated value of a=5
	    
	    System.out.println();
	    
	    System.out.println("Relational operators");
	    System.out.println("Value of a ="+a);
	    System.out.println("Value of b="+b);
	    System.out.println(a==b);//the result will be in boolean
	    System.out.println(a>b);
	    System.out.println(a<b);
	    System.out.println(a>=b);
	    System.out.println(a<=b);
	    System.out.println(a!=b);
	    
	    System.out.println();
	    System.out.println("Logical operators");
	    String userName="abc";
	    String password=("1234");
	    //And&& verify whether both conditions are true
	    System.out.println(userName=="xyz" && password=="789");//here check abc==xyz && 1234==789,condition 1 is false so result will be false
	    System.out.println(userName=="abc" && password=="1234");
	    
	    System.out.println("ResultOR");
	    System.out.println(userName=="abc"|| password =="789");//at least one condition is true, the result is true
	    System.out.println(userName=="jhj"||password =="5556");// both conditions are false , result  =false
	    
	    System.out.println();
	    System.out.println("Result of NOT operator");
	    System.out.println(!(userName=="ory"));
	    
	    
	    System.out.println();
	    System.out.println("Unuary operator"); 
	    //post increment or decrement i++,i-- the value will updated after printing
	    int i =1;
	    System.out.println("Value of i=" +i);
	    System.out.println("The value of i++ =" +(i++));//the value of i is updated after this line
	    System.out.println("The updatednvalue of i =" +i);
	    
	    System.out.println();
	    //pre increment or decrement ++i,--i the value will updated before printing
	    System.out.println("Preincrement");
	    System.out.println("Value of i=" +i);
	    //System.out.println("The value of i after ++i" +(++i));
	    System.out.println(++i); //the value of i is incremented by 1, then the value is displayed
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
