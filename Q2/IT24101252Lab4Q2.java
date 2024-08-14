import java.util.Scanner;

public class IT24101252Lab4Q2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter exam marks (out of 100): ");
	double examMarks = sc.nextDouble();
	while (examMarks < 0 || examMarks > 100 ){
		System.out.print("Invalid input for exam marks. Terminating program. ");
	}
	System.out.println("Please enter lab submission marks (out of 100): ");
	double labMarks = sc.nextDouble();
	while (labMarks < 0 || labMarks > 100 ){
		System.out.print("Invalid input for lab marks. Terminating program. ");
	}
	
	System.out.println("Please enter the percentage given for the exam: ");
	double percentageforexam = sc.nextDouble();
	
	
	System.out.print("Please enter the percentage given for the lab submission: ");
	double percentageforlab = sc.nextDouble();
	while (percentageforexam + percentageforlab != 100 ){
		System.out.print("The percentages must add up to 100. Terminating program. ");
	}
	
	double FinalMarks = (examMarks * percentageforexam/100) + (labMarks * percentageforlab/100);
	System.out.print("The Final Exam Mark is : " +FinalMarks);
	}
}
	