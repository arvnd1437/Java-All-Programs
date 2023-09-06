package com.MT.pkg;

public class Confusion {

	public static void main(String[] args) {
		Confusion con=new Confusion();
		//con.demo1();
		con.demo2();
		

	}

	private void demo2() {
		for(int i=0;i<=100;i++)
			//o-octal
			//ob oB - Binary
			//ox or OX - Hexa
			//Decimal
		{
			System.out.print(i+"\t");
			System.out.print(Integer.toBinaryString(i)+"\t");
			System.out.print(Integer.toOctalString(i)+"\t");
			System.out.println(Integer.toHexString(i)+"\t");
		}
		
	}

	private void demo1() {
		System.out.println(010);
		System.out.println(0x13);
		System.out.println(0xA);
		System.out.println(0b1000);
		System.out.println(0B100);
		
	}

}
