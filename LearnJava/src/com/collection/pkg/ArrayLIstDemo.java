package com.collection.pkg;

import java.util.ArrayList;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		ArrayLIstDemo ad=new ArrayLIstDemo();
//		ad.demo1();//Ascending order
//		ad.demo2();//Descending order
		ad.demo3();//remove duplicates
		

	}

	private void demo3() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(1);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					al.remove(j);
				}
			}
		}
		System.out.println(al);
	}

	private void demo2() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(1);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)<al.get(j)) {
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
			}
		System.out.println(al);
	}

	private void demo1() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(1);
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)) {
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
		
	}

}
