package strings.examples;

import java.util.Calendar;

public class getChar {

	public static void main(String[] args) {
		String str1 = "java string example";
		String str2 = "java string example";
		System.out.println( "character at 5 is: "+(str1.charAt(5)));
       
       if(str1.compareToIgnoreCase(str2)==0)
       {
    	   System.out.println("str is equal to str2");
       }
       else if(str1.compareToIgnoreCase(str2)<0)
       {
    	   System.out.println("string one is less than string 2 ");
       }
       else
       {
    	   System.out.println("string1 is greater than stringg2");
       }
       
       System.out.println(str1.concat(str2));
        System.out.println(str1.contains("exam"));
        
        System.out.println(str1.contentEquals(str2));
        
        System.out.println(str1.contentEquals(str2));
        
        char[] num= {'2','3','4','6','7'};
        String str= String.copyValueOf(num);
        System.out.println(num);
        String str3 =String.copyValueOf(num,1, 4);
        System.out.println(str3);
        
        System.out.println(str1.endsWith("le"));
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        
        Calendar c = Calendar.getInstance();
        System.out.format("%th %te, %tY%n", c,c,c);
        System.out.format("%tl:%tm %tp%n", c,c,c);
        String s2 = new StringBuffer("Java").append(" Exercises").toString();
        System.out.println(s2);
        String s3 = s2.intern();
        System.out.println(s3);
        
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.startsWith("exercise"));
        
        System.out.println(str1.substring(2, 10));
        System.out.println(str1.substring(5));
        System.out.println(str1.subSequence(2, 15));
        
        String s4="  new string    ";
        String newString = s4.trim();
        System.out.println(newString);
        getChar.palindrome("nhsjkjshoikn");
	}
	public static void palindrome(String str5)
	{
		
		str5="nhsjkjshoikn";
		int n= str5.length();
		int length=0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j < n-1; j--) {
				if(str5.charAt(i)==str5.charAt(j))
				{
					i++; 
					System.out.print();
				}
			}
			
		}
		System.out.println(length);
		
	}
}
