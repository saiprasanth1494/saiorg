package javaprograms;

public class DescendingArray {
	public static void main(String[] args) {
		int []ar=new int[3];
		ar[0]=230;
		ar[1]=275;
		ar[2]=300;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					}
			}
		}for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}

}
