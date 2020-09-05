package JavaCourse;

public class constractorClass {
	public constractorClass()
	{
		System.out.print("Hello : ");
	}
	public constractorClass(String name) {
		System.out.print(name+" ");
	}
	public constractorClass(String jobTitle ,String companyName) {
		System.out.print(jobTitle+" "+companyName);
	}
	public static void main(String[] args) {
		constractorClass conobj1 = new constractorClass();
		constractorClass conobj2 = new constractorClass("Esraa Elalfy");
		constractorClass conobj3 = new constractorClass("QC Engineer","at Vodafone");
	}

}
