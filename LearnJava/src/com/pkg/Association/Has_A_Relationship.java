package com.pkg.Association;

public class Has_A_Relationship {

	public static void main(String[] args) {
		A a=new A();
		a.b.m();
		a.n();
//		A.b.m(); //A-System,b-Out,m()-Print/PrintLn
	}
}


class A{
	B b = new B();//Field>Instance Variable
//	static B b = new B(); //Field>Static Variable
	void n() {
		System.out.println("We Are Learning Python");
//		System.err.println("We Are Learning Python");
	}
	
}

class B{
	void m() {
		System.out.println("We Are Learning Java");
		
	}
}
