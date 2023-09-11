package com.collection.pkg;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ToRemoveDublicatesInList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(7);
		al.add(7);
		al.add("Venket");
		al.add("Venket");
		al.add("Apple");
		al.add("Blue");
		al.add(0.5);
		al.add(1,"raja");
		System.out.println(al);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);// 20 Convention in addAll();
		System.out.println(lhs);
		
		

	}

}
