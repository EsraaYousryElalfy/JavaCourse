package JavaCourse;

public class arrayClass {

	public static void main(String[] args) {
		int[] testArr1;
		testArr1=new int[10];
		int arrLength1=testArr1.length;
		System.out.println("Array Length = "+arrLength1);
		int[] testArr2=new int[20];
		int arrLength2=testArr2.length;
		System.out.println("Array Length = "+arrLength2);
		int[] testArr3= {1,2,3,4,5};
		int arrLength3=testArr3.length;
		System.out.println("Array Length = "+arrLength3);
		for(int i=0;i<arrLength3;i++)
		{
			System.out.println("Current element is "+testArr3[i]);
		}
	}

}
