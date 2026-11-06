package stringPackage;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		if(s2.equals(s2))
				{
				  System.out.println("Values are equal");
				}
				else
				{
				  System.out.println("Values are not equal");
				}
				
				//equalIgnoreCase()
				if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("Values are equal");
				}
				else
				{
				  System.out.println("Values are not equal");
				}
	             			
				//concat()
				String s4="World";
				System.out.println(s1.concat(s4));  //HelloWorld
				
				
				//contains()
				System.out.println(s4.contains("Wo"));
				
				//toUppercase()
				System.out.println(s1.toUpperCase());  //HELLO
				
				//toLowercase()
				System.out.println(s1.toLowerCase());  //hello
				
				//length()
				System.out.println(s1.length());
				
				
				//trim()-to remove whitespace from starting or end
				
				String s5="  Hello";
				System.out.println("Before trim:"+s5);
				System.out.println("After trim:"+s5.trim());

				//startsWith()-to check whether the word start with a specific word or letter
				String s6="Hello everyone good morning";
				System.out.println(s6.startsWith("Hello"));
				System.out.println(s6.endsWith("morning"));
				
				//charAt(Index position)
			    System.out.println(s6.charAt(2)); //to retrieve the letter at a specific index position
				
			    //substring(start index, end index)
			    System.out.println(s6.substring(0,12));
			    
			    //split()- to split a sentence based upon a condition
			    String [] result=s6.split("e");
			    System.out.println("The result after split ");
			    for(String v:result)
			    {
			    	System.out.println(v);
			    }
			    System.out.println("Number of words="+result.length); //to find the number of words in a sentence
			    
				//toCharArray()-to retrieve as single characters from a String
			    String s7="Riya Varkey";
			    char [] ar=s7.toCharArray();
			    System.out.println("Result of char array");
			    for(char c:ar)
			    {
			    	  System.out.println(c);
			    }
			    
			    //replace()-to replace a specific word from a sentence
			    System.out.println(s6.replace("Hello", "Hi"));
			    
			 
				}
	}

