package JavaCourse;

public class interfaceImplementClass implements InterfaceClass {
	@Override
	public void addition() {
		System.out.println("addition Interface");		
	}
	public static void main(String[] args) {
		interfaceImplementClass iIc= new interfaceImplementClass();
		iIc.addition();
	}
}
