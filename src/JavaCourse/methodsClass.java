package JavaCourse;

public class methodsClass {
	int students;
	int weeks;
	int days;
	int hours;
	public void courseHours()
	{
		int totalCourseHours;
		totalCourseHours=weeks*days*hours;
		System.out.println("Total Course Hours "+totalCourseHours);
	}
	public void courseDays()
	{
		int totalCourseDays;
		totalCourseDays=weeks*days*students;
		System.out.println("Total Course Days "+totalCourseDays);
	}
	public int courseLength()
	{
		int courseLength=weeks*days*hours*students;
		return courseLength;
	}
	public static void main(String[] args) {
		methodsClass methclass=new methodsClass();
		methclass.students=10;
		methclass.weeks=4;
		methclass.days=3;
		methclass.hours=3;
		int totalCourseHours;
		int totalCourseDays;
		totalCourseHours=methclass.hours*methclass.days*methclass.weeks*methclass.students;
		totalCourseDays=methclass.weeks*methclass.days;
		System.out.println("Total course days "+totalCourseDays+" days");
		System.out.println("Total course hourse "+totalCourseHours+" hours");
		methclass.courseDays();
		methclass.courseHours();
		int lenghtOfCOurse=methclass.courseLength();
		System.out.println("The course length is "+lenghtOfCOurse);
		System.out.println("is weeks more than students "+(methclass.weeks>methclass.students));
	}

}
