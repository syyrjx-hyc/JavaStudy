package java_study;//: object/Test.java

class MyInt {
	int value;
}

public class Assignment {
	public static void main(String[] args) {
		MyInt x1 = new MyInt();
		MyInt x2 = new MyInt();
		x1.value = 2;
		x2.value = 3;
		System.out.println("x1.value:"+x1.value+" x2.value:"+x2.value);
		x1 = x2;
		System.out.println("x1.value:"+x1.value+" x2.value:"+x2.value);
		x1.value = 22;
		System.out.println("x1.value:"+x1.value+" x2.value:"+x2.value);
	}
}