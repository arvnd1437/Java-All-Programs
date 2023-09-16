package com.collection.pkg;

import java.util.HashSet;
import java.util.Iterator;


public class LearnSetDemo {

	public static void main(String[] args) {
		LearnSetDemo lsd=new LearnSetDemo();
		lsd.demo1();
	}

	private void demo1() {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(5);
		hs.add(77);
		hs.add(7);
		hs.add(90);
		hs.add(55);
		hs.add(9);
		hs.add(3);
		hs.add(100);
		Iterator<Integer> value=hs.iterator();
		while(value.hasNext()) {
//			System.out.println(value.next());//all element print 
			int x=value.next();
			if(x>=50) {
				System.out.println(x);
			}
			
		}
	}

}
