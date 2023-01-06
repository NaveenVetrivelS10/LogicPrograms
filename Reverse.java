package logicPros;
import java.util.Scanner;
public class Reverse {
	

	
	   public static void main(String[] args) {
	   
		 Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine();
	        scan.close();
	        
	      
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println(reversed );
	        if(str.equals(reversed))
	        {
	        System.out.println("yes palindrome");
	        }
	        else
	        System.out.println("NO palindrome");
	        
	}
}

// if it is a palindrome, print No otherwise
	 
		   
		
	   
	   
	 