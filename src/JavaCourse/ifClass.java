package JavaCourse;

public class ifClass {
	int students;
	int weeks;
	int days;
	int hours;
	public static void main(String[] args) {
		ifClass ifclass=new ifClass();
		ifclass.students=10;
		ifclass.weeks=4;
		ifclass.days=3;
		ifclass.hours=3;
		if (ifclass.students>ifclass.weeks)
		{
			System.out.println("Unfortunately students more than weeks");
		}
		else if (ifclass.students<ifclass.weeks)
		{
			System.out.println("Unfortunately students less than weeks");
		}
		else
		{
			System.out.println("The course is very good!");
		}
	}

}
