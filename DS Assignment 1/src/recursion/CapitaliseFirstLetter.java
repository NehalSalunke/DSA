package recursion;

public class CapitaliseFirstLetter {

		public static void main(String[] args) 
		{
		    String str = "i love my india";
		    System.out.println(capSentence(str, true));
		}
		
	public static String capSentence(String string, boolean capitalize) 
		{
		    if (string.length() == 0) 
		    {
		      return "";
		    }
		    String capital = string.substring(0, 1);
		    if (capitalize) 
		    {
		    	return capital.toUpperCase()+capSentence(string.substring(1),capital.equals(" "));
		    } else 
		    {
		    	return capital.toLowerCase()+capSentence(string.substring(1),capital.equals(" "));
		    }
		}
	}

