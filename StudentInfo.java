
public class StudentInfo 
{

	
		// TODO Auto-generated method stub

		/*declare attributes
		 * inputs-setter
		 * public void setx(datatype xval)
		 * {x = xval;}
		 * outputs-getter
		 * public datatype getx()
		 * {return x;}
		 * 
		 */
	private String studentName;
	private String letterGrade;
	private double classCredits = 0;
	private double gradePoints = 0;
	private double GPA = 0;
		
	
	public StudentInfo()
	{
		System.out.println("-----constructor called-----");
		studentName = "none";
		letterGrade = "none";
		classCredits = 0;
		gradePoints = 0;
		GPA = 0;
	}
		
	public String getName()
	{
		return studentName;
	}
	
	public double getCredits()
	{
		return classCredits;
	}
	
	public String getLetterGrade()
	{
		return letterGrade;
	}
	
	public double addClass(double gradePoints)
	{
		if(letterGrade.equals("A"))
			gradePoints = 4;
		else if(letterGrade.equals("B"))
			gradePoints = 3;
		else if(letterGrade.equals("C"))
		gradePoints = 2;
		else if(letterGrade.equals("D"))
			gradePoints = 1;
		else if(letterGrade.equals("F"))
			gradePoints = 0;
		else gradePoints = 0;
		gradePoints += gradePoints;
		return gradePoints;
	}
	
	public double getGPA()
	{
		GPA = gradePoints / classCredits;
		return GPA;
	}
	
	public void setGradePoints(double gradePoints)
	{
		this.gradePoints = gradePoints;
	}
		
	public void setName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setClassCredits(double classCredits)
	{
		this.classCredits = classCredits;
	}
	
	public void setLetterGrade(String letterGrade)
	{
		this.letterGrade = letterGrade;
	}
		
		
		

}//end class
