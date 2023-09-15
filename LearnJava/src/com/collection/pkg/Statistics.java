package com.collection.pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class Statistics {

	public static void main(String[] args) {
		Statistics ss=new Statistics();
//		ss.demo1();//find Average
//		ss.demo2();//Media mid value
//		ss.demo3();//occurs most frequently
		ss.demo4();
		
		
		
		
		
	

	}

	private void demo4() {
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			if(al.get(i)==5) {
				al.set(i, 10);
			}
		}
		System.out.println(al);
	}

	private void demo3() {
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<al.size();i++) {
			int counter=1;
			if(i==0) {
				continue;
			}
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					counter++;
					al.set(j, 0);
				}
			}
			hm.put(al.get(i), counter);
		}
		System.out.println(hm);
		
		
	}

	private void demo2() {
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
		if(al.size()%2==0) {//even
			System.out.println("Mid value: "+al.get(al.size()/2));
			System.out.println("Mid value: "+al.get(al.size()/2-1));
		}
		else//odd
			System.out.println("Mid value: "+al.get(al.size()/2));
	}

	private void demo1() {
		int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(5);
		al.add(7);
		al.add(9);
		al.add(1);
		al.add(5);
		al.add(3);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			sum=sum+al.get(i);	
		}
		System.out.println("Mean Value"+sum/al.size());
	}

}
