//reverse method

import java.util.Scanner;

public class ReverseMethod {

	public static void main(String[] args)
	{
		Scanner inputValue = new Scanner(System.in);
		
		StringBuffer reverse = new StringBuffer(inputValue.nextLine());
		
		reverse.reverse();
		
		System.out.println(reverse);
		
	}
}
