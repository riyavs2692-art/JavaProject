package iterativestatements;

public class Whilesum {

	public static void main(String[] args) {
		int i=1,sum=0;
	      
	      while(i<=10)
	      {
	    	  //System.out.println(i);
	    	  sum=sum+i;  //sum=0+1=1, sum=1+2=3,sum=3+3=6 etc..
	    	  
	    	  i++;
	      }
	      System.out.println("The sum = "+sum);
	}

}
