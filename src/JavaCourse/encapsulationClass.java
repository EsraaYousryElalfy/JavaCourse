package JavaCourse;

public class encapsulationClass {
	private String firstName;
	private String lastName;
	private int age;
	private String jobTitle;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setFirstName(String fName) {
		firstName=fName;
	}
	public void setLastName(String lName) {
		lastName=lName;
	}
	public void setAge(int newAge) {
		age=newAge;
	}
	public void setJobTitle(String jTitle) {
		jobTitle=jTitle;
	}
	public static void main(String[] args) {
	encapsulationClass enClass = new encapsulationClass();
	enClass.setFirstName("Esraa");
	enClass.setLastName("Elalfy");
	enClass.setAge(26);
	enClass.setJobTitle("QC Engineer");
	System.out.println("Full Name is "+enClass.getFirstName()+" "+enClass.getLastName());
	System.out.println("Age is "+enClass.getAge());
	System.out.println("Job Title is "+enClass.getJobTitle());
	}
}
