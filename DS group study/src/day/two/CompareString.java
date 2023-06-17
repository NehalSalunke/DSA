package day.two;

public class CompareString {

	public static void main(String[] args) {
		String[] arr= {"a","b","c"};
		String[] arr1= {"a","b","d"};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals(arr[i]))
					{
						System.out.println(arr[j]);
					}
			}
		}

	}

}
