package javaprograms;

public class PalindromeOfNum {
	public static void main(String[] args) {
		int num=12521;
		int rev=0;
		int temp=num;
		while(num>0) {
			int n=num%10;
		    rev=(rev*10)+n;
		    num/=10;
		}
		if(rev==temp) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
	}

}
