package com.collection.pkg;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(7);
		ll.add(7);
		ll.add("Venket");
		ll.add("Apple");
		ll.add("Blue");
		ll.add(0.5);
		ll.remove(3);
		System.out.println(ll);

	}

}
