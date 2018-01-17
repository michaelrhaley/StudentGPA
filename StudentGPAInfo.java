import java.util.Scanner;

public class StudentGPAInfo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//declare variables
		String studentName;
		String letterGrade;
		String anotherClass;
		double classCredits = 0;
		double gradePoints = 0;
		double GPA = 0;
		
		
//		String letterGrade;
//		int classCredits = 0;
//		int gradePoints = 0;
//		double GPA = 0;
		
		Scanner input = new Scanner(System.in);
		StudentInfo stuInfo = new StudentInfo();
		//stuInfo.setName("John Snow");
		
		//method for calculating GPA
		
		//get input
		System.out.print("Student name");
		studentName = input.nextLine();
		do
		{
		System.out.print("Letter grade");
		letterGrade = input.nextLine();
		System.out.print("Class credit");
		classCredits = Double.parseDouble(input.nextLine());
		System.out.print("Another class? (y/n)");
		anotherClass = input.nextLine();
		classCredits += classCredits;
		}while(anotherClass.equals("y"));
		
		stuInfo.setName(studentName);
		stuInfo.setLetterGrade(letterGrade);
		stuInfo.setClassCredits(classCredits);
		stuInfo.addClass(gradePoints);
		
		System.out.println(stuInfo.getName() + ", your GPA is " + stuInfo.getGPA());
		
		
		
		
		
		
		
		
	}//end main

}//end class
