package javaprograms;

public class Abstraction extends RbiBank{

	@Override
	void savingsAcc() {
		System.out.println("6%");	
	}
	public static void main(String[] args) {
		Abstraction ab=new Abstraction();
		ab.deposit();
		ab.savingsAcc();
		
	}

}
