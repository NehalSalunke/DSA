package day.two;

import java.util.Scanner;

public class Class1 {     // question 14 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find the strings are same or not");
		System.out.println("first string: ");
		String str1 = scan.next();
		System.out.println("second string: ");
		String str2 = scan.next();
        Class1 obj = new Class1();
        obj.compareString(str1, str2);
	}
  public void compareString(String str1, String str2)
  {
	  boolean equals = str1.equalsIgnoreCase(str2);
	  System.out.println( str1 + " equals " +
	            str2 + "? " + equals);
  }
   public void compareLexicographically(String str1, String str2)
   {
	   boolean check = str1.equalsIgnoreCase(str2);
	   if(check > 0)
	   {
		   
	   }
   }
}
