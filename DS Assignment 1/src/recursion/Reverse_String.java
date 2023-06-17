package recursion;

public class Reverse_String {

	public static void main(String[] args) 
	{
	 Reverse_String rev=new Reverse_String();
	 rev.reverse("Nehal");
	 rev.reverse("Ashok");
	 rev.reverse("Salunke");

	}
	public String reverse(String str)
	{
      if ((str==null)||(str.length()<=1))
    	  System.out.println(str);
      else
      {
    	  System.out.print(str.charAt(str.length()-1));
    	  reverse(str.substring(0,str.length()-1));
      }
	return str;
}
}