package javaprograms;

public class CountOdd50 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
