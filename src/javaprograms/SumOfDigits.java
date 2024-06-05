package javaprograms;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=345;
		int sum=0;
		while(num>0) {
			int n=num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println(sum);
	}

}
