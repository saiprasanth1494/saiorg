package javaprograms;

public class ArmstrongOrNot {
	public static void main(String[] args) {
		int num=153;
		int arm=0;
		int temp=num;
		while(num>0) {
			int n=num%10;
			arm=arm+(n*n*n);
			num/=10;
		}
		if(arm==temp) {
		System.out.println("armstrong");
	}
		else {
			System.out.println("not armstrong");
		}}
}
