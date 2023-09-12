package com.collection.pkg;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("mango");
		al.add("orange");
		al.add("apple");
		al.add("graps");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		

	}

}
