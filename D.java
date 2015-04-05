class student 
{
	static int stdId=90;
	static void percentage()
	{
		System.out.println("Percentage Calculation");
	}
}
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts....");
		student.percentage();
		System.out.println("The student id is "+student.stdId);
		System.out.println("Main ends....");
	}
}
