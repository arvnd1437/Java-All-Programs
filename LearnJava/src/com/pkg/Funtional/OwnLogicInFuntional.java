package com.pkg.Funtional;

import java.util.stream.Stream;

public class OwnLogicInFuntional {

	public static void main(String[] args) {
		OwnLogicInFuntional ol=new OwnLogicInFuntional();
//		ol.demo1();//Print 1 to 10
//		ol.demo2();//print only even number
//		ol.demo3();//print only odd number
		ol.demo4();

	}

	private void demo4() {
	}

	private void demo3() {
		Stream.iterate(1, i->++i).limit(10).filter(i->i%2==1).forEach(n->System.out.print(n+" "));
	}

	private void demo2() {
//		Stream.iterate(1, i->++i).limit(10).filter(i->i%2==0).forEach(n->System.out.print(n+" "));
		Stream.iterate(2, i->i+2).limit(10).forEach(n->System.out.print(n+" "));//print 2 tables
	}

	private void demo1() {
		Stream.iterate(1,i-> ++i).limit(10).forEach(n->System.out.print(n+" "));
	}

}
