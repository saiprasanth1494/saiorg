package javaprograms;

public class CountNumOfDigit {
	public static void main(String[] args) {
		int count=0;
		int num=955122;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}

}
