package JavaCourse;

public class overloadingClass {
	public void fName(String fname)
	{
		System.out.println("First Name : "+fname);
	}
	public void fName(String fname,String lname)
	{
		System.out.println("Name : "+fname+" "+lname);
	}
	public void fName(String fname,String mname,String lname)
	{
		System.out.println("Full Name : "+fname+" "+mname+" "+lname);
	}
	public int fName(int x,int y)
	{
		return x*y;
	}
	public static void main(String[] args) {
		overloadingClass overloadclass = new overloadingClass();
		overloadclass.fName("Esraa");
		overloadclass.fName("Esraa", "Elalfy");
		overloadclass.fName("Esraa", "Yousry", "Elalfy");
		int result=overloadclass.fName(5,5);
		System.out.println("Result equal "+result);
	}

}
