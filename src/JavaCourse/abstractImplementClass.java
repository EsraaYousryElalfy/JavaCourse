package JavaCourse;

public class abstractImplementClass extends abstractionClass {
	public void sound() {
		System.out.println("Sound");
	}
	public void walk() {
		System.out.println("walk");
	}
	public static void main(String[] args) {
		abstractionClass absObj= new abstractImplementClass();
		absObj.sound();
		absObj.walk();
	}
}
