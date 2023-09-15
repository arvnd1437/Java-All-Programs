package com.collection.pkg;

import java.util.HashMap;

public class HashMapNullValueCheck {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put(null, null);
		hm.put(null,null);
		hm.put(null,"IS Legacy PL OO PL");
		hm.put("Python",null);
		hm.put("JS","IS a FE SL as well as PL");
		System.out.println(hm);
		}

}
