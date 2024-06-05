package org.abstraction;

public class InterChild implements InterWhite,InterBlack {

	@Override
	public void sample1() {
		System.out.println("nothing1");
		
	}

	@Override
	public void sample2() {
		System.out.println("nothing2");
		
	}

	@Override
	public void sample3() {
		System.out.println("nothing3");
		
	}

	@Override
	public void sample4() {
		System.out.println("nothing4");
		
	}

	@Override
	public void sample5() {
		System.out.println("nothing123");
		
	}
	public static void main(String[] args) {
			InterChild inc=new InterChild();
			inc.sample1();
			inc.sample2();
			inc.sample3();
			inc.sample4();
			inc.sample5();
	}	}
//	@Override
//	public void sample1() {
//		System.out.println("nothing1");
//	}
//	@Override
//	public void sample2() {
//		System.out.println("nothing2");
//	}
//	@Override 
//	public void sample3() {
//		System.out.println("nothing3");
//	}
//	@Override 
//	public void sample4() {
//		System.out.println("nothing4");
//	}
//	@Override 
//	public void sample5() {
//		System.out.println("nothing5");
	
//	}
//	public static void main(String[] args) {
	//	InterChild inc=new InterChild();
	//	inc.sample1();
	//	inc.sample2();
	//	inc.sample3();
	//	inc.sample4();
//		inc.sample5();
//	}


