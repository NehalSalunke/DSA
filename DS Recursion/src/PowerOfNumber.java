import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Enter any number and its power : ");
		int num = scan.nextInt();
		int pow = scan.nextInt();
		Power(num, pow);
	}
	}
	
	static void Power(int number, int power)
	{
		if(power==0 || power==1)
		{
			System.out.println("give correct power");
		}
//		if() {
//			number = number*(power-1);
//		}
		else {
			number = number *(power-1);
			System.out.println(number);
		}
	}


}
//5 = 5*5*5*5*5
//	= n*(n-1)