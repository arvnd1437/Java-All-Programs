package com.collection.pkg;

import java.util.HashMap;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String s="payilagam";
		char c[]=s.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='*') {
				continue;
			}
			int counter=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					counter++;
					c[j]='*';
				}
			}
			hm.put( c[i], counter);
		}
		System.out.println(hm);

	}

}
