package stringPackage;

public class Wordcount {

	public static void main(String[] args) {
		  //String sentence = "Java is simple and easy to learn"; 
	      // Count the number of words in the sentence.
	      String s2="Java is simple and easy to learn";
	      String rev ="";
	      String [] result= s2.split(" ");
	      char[]ch=s2.toCharArray(); 
	      for(String v:result)
	      {
	    	  System.out.println(v);
	      }
	      System.out.println("Number of words="+result.length);
	      
	      for(int i=ch.length-1;i>=0;i--) 
	        {
	            rev +=ch[i]; 
	        }
	        System.out.println("Reversed Sentence: " + rev);

	}

}
