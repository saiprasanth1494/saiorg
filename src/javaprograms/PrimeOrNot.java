package javaprograms;

public class PrimeOrNot {
	public static void main(String[] args) {
		int a =12;
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not");
		}
	}

}
