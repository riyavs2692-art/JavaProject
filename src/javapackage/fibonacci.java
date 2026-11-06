package javapackage;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        int first, second, next, n;
        first = 0;
        second = 1;
         System.out.print("Enter limit");
        n = scanner.nextInt();
        
      
        System.out.print(first +" "+ second);
        for(int i = 1; i <= n; i++){
         next = first + second;  
         System.out.print(" "+ next);
         first = second;
         second = next;
        }

	}

}

