package org.abstraction;

public class ChildAbs extends ParentAbs {
	@Override
	 public void whitez() {
		System.out.println("whitez fellow");
	}
	
	@Override
	 public void yellow() {
		System.out.println("its not dirty fellow");
	}
	public static void main(String[] args) {
		ChildAbs abs=new ChildAbs();
		abs.whitez();
		abs.yellow();
		
	}

}
