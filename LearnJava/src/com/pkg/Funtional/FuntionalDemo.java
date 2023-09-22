package com.pkg.Funtional;

import java.util.ArrayList;

public class FuntionalDemo {

	public static void main(String[] args) {
		FuntionalDemo fd=new FuntionalDemo();
//		fd.demo1();
//		fd.demo2();
//		fd.demo3();
		fd.demo4();
	}

	private void demo4() {
		
	}

	private void demo3() {
		ArrayList <String> al=new ArrayList();
		al.add("Aravindh");
		al.add("Natarajan");
		al.add("Chandhuru");
		al.add("Nithya Ashwini");
		al.add("Sakthi");
		
		al.forEach(i->System.out.println(i));//Print String
//		System.out.println(al.stream().filter(n->n.contains("a")).count());//count contain of letter "a" in given String
//		al.stream().forEach(i->System.out.println(i.toUpperCase()));
//		al.stream().forEach(i->System.out.println(i.toCharArray()));
		
	}

	private void demo2() {
		ArrayList <Integer> al=new ArrayList();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
//		System.out.println(al.stream().filter(n->n%2==1).mapToInt(i->i).sum());//print sum of odd element
//		System.out.println(al.stream().filter(n->n%2==1).mapToInt(i->i).count());//print count of odd element count
//		al.stream().filter(n->n%2==1).mapToInt(i->i).forEach(i->System.out.println(i));//print odd element
//		System.out.println(al.stream().filter(n->n%2==1).count());//print count of odd element count

	}

	private void demo1() {
		ArrayList <Integer> al=new ArrayList();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.forEach(i->System.out.println(i));
	}

}
