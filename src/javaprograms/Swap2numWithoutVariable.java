package javaprograms;

public class Swap2numWithoutVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
	}

}
