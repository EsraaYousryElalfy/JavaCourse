package JavaCourse;

import java.util.ArrayList;

public class arrayListClass {

	public static void main(String[] args) {
		// string array list
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Esraa");
		stringArrayList.add("Yousry");
		stringArrayList.add("Ahmed");
		stringArrayList.add(3, "Mohammed");
		stringArrayList.add(4, "Elalfy");
		System.out.println("Array List Contains : "+stringArrayList);
		stringArrayList.remove(0);
		System.out.println("Array List Contains : "+stringArrayList);
		stringArrayList.remove("Elalfy");
		System.out.println("Array List Contains : "+stringArrayList);
		stringArrayList.clear();
		System.out.println("Array List Contains : "+stringArrayList);
		// integer array list
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(3, 4);
		integerArrayList.add(5);
		for(int i=0;i<integerArrayList.size();i++)
		{
			System.out.print("{"+integerArrayList.get(i)+"}");
		}
		integerArrayList.remove(integerArrayList.size()-1);
		System.out.println("Array List Contains : "+integerArrayList);
	}
}