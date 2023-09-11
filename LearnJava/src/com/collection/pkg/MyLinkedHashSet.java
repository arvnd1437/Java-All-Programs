package com.collection.pkg;


import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet hs =new LinkedHashSet();
		hs.add("mango");
		hs.add("apple");
		hs.add(5);
		hs.add(75.75);
		hs.add("mango");
	
		System.out.println(hs);

	}

}
