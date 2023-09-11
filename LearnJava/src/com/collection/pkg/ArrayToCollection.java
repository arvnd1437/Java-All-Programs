package com.collection.pkg;

import java.util.ArrayList;

public class ArrayToCollection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int a[]= {5,91,100,1001,95};
		/*
		for(int i:a) {//advance for loop
			al.add(i);
		}
		System.out.println(al);
		*/
		
		/*
		for(int i=0;i<a.length;i++) {
			al.add(i,a[i]);
		}
		System.out.println(al);
		*/
		
		for(int i=0;i<a.length;i++) { //to use 0 the output reverse
			al.add(0,a[i]);
		}
		System.out.println(al);
	}
}
