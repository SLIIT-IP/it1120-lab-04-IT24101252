import java.util.Scanner;

public class IT24101252Lab4Q1
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	
	if (number > 0 ) {
		System.out.print("The number is: Positive ");
	}
	else if (number < 0 ) {
		System.out.print("The number is: Negative ");
	}
	else {
		System.out.print("The number is Zero ");
	}
	}
}