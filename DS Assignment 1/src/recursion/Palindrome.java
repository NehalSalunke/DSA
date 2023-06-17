package recursion;
import java.util.Scanner;

public class Palindrome 
{
	static boolean isPalindrome(String str) 
	{		
		if (str.length() == 0 || str.length() == 1)
			return true;
		
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return isPalindrome(str.substring(1, str.length() -   1));
		return false;
	}
 
	public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Enter the String :");
	    String str = sc.nextLine();   

	    if (isPalindrome(str)) 
	        System.out.println(str + " is palindrome"); 
	    else
	        System.out.println(str + " is not a palindrome"); 
	}
}

