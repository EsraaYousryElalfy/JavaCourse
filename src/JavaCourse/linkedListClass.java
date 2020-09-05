package JavaCourse;

import java.util.LinkedList;

public class linkedListClass {

	public static void main(String[] args) {
		LinkedList<String> linkList=new LinkedList<String>();
		linkList.add("Esraa");
		linkList.add("Yousry");
		linkList.add(2, "Ahmed");
		linkList.add(3, "Mohammed");
		linkList.add("Elalfy");
		System.out.println("Linked list contains : "+linkList);
		linkList.addFirst("My name is");
		linkList.addLast("Thanks");
		System.out.println("Linked list contains : "+linkList);
		Object firstItem=linkList.get(0);
		System.out.println("First Linked list item is : "+firstItem);
		linkList.set(6, "QC Engineer");
		Object lastItem;
		lastItem=linkList.get(6);
		System.out.println("Last Linked list item is : "+lastItem);
		linkList.remove(0);
		System.out.println("Linked list contains : "+linkList);
		linkList.removeFirst();
		System.out.println("Linked list contains : "+linkList);
		linkList.removeLast();
		System.out.println("Linked list contains : "+linkList);
		linkList.remove();
		System.out.println("Linked list contains : "+linkList);
	}

}
