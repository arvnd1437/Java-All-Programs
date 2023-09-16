package com.collection.pkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LearnMapDemo {

	public static void main(String[] args) {
		LearnMapDemo lmd =new LearnMapDemo();
//		lmd.demo1();
//		lmd.demo2();//iterator linked list
		lmd.demo3();

	}

	private void demo3() {
		LinkedList<String> cities=new LinkedList<String>();
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Kolkata");
		int i=0;
		while(i<cities.size()) {
			System.out.println(cities.get(i));
			i++;
		}
		
	}

	private void demo2() {
		LinkedList<String> cities=new LinkedList<String>();
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Hyderabad");
		cities.add("Kolkata");
		Iterator<String>itr=cities.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

	private void demo1() {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("java","IS a PI OO PL");
		hm.put("c","IS a PL");
		hm.put("C++","IS Legacy PL OO PL");
		hm.put("Python","IS a Dynamic PI OO PL");
		hm.put("JS","IS a FE SL as well as PL");
//		System.out.println(hm);
		
		for(Map.Entry<String, String>m:hm.entrySet()) {
			System.out.println(m.getKey()+" \t"+" --> " + m.getValue());
		}
		
		

	}

}
