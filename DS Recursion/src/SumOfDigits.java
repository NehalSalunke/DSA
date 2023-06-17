import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter any number : ");
			int num = scan.nextInt();
			sumDigits(num);
		}
		}
	 static void sumDigits(int sum) {
			 
		 if(sum>0)
		 {
			 sum=(sum%10)+(sum/10);
			 System.out.println(sum);
		 }
		 else
		 {
			 System.out.println("cannot find sum of digits");
		 }
		 
		 
		 } 

	

}
