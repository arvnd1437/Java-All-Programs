package com.collection.pkg;

import java.util.LinkedHashSet;

public class CollectionToArray {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Abc");
		lhs.add(5);
		lhs.add(75.75);
		lhs.add("IJK");
		lhs.add(true);
		lhs.add('Q');
		System.out.println(lhs);
		Object o[]=lhs.toArray();//Heterogeneous Array to object array
		for(Object i:o) {
			System.out.println(i);
		}

	}

}
