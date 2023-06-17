package day.one;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" type string to get numbers of vowels in it ");
		String data = sc.next();
		vowelsCount(data);
	}
	public static void vowelsCount(String data)
	{
		int count=0;
		data.toLowerCase();
		for (int i = 0; i < data.length(); i++) {
			int str = data.charAt(i);
			if(str== 'a' || str=='A' || str=='e' || str=='E' || str=='i'||str=='I'||str=='o'||
					str=='O'||str=='u'||str=='U')
			{
				count++;
			}
		}
		System.out.println("number of vowels in a string is "+count);
	}


}
