package JavaCourse;

public class overridingClass extends calculationInheritanceClass{
	public void Multiplication(int weeks,int days)
	{
		int counting=weeks*days;
		System.out.println("Calculation = "+counting);
	}
	public void addition(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition is = "+z+" nums");
	}
	public void subtraction(int x,int y)
	{
		int z=x-y;
		System.out.println("Subtraction is = "+z+" nums");
	}	

	public static void main(String[] args) {
		overridingClass arCourses=new overridingClass();
		calculationInheritanceClass inherclass=new calculationInheritanceClass();
		arCourses.Multiplication(10, 2);
		arCourses.subtraction(10, 2);
		arCourses.addition(5, 5);
		inherclass.addition(2, 2);
		inherclass.subtraction(10, 5);

	}

}
