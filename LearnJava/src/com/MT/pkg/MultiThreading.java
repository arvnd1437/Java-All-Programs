package com.MT.pkg;

class  A extends Thread
{
	public  void run()
	{
// print prime number b/w 100 and 300
		for(int i=9000; i<=9100; i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
				
			{
				if(i%j==0)
				{
				count++;
				}
			}
			if(count==0)
			{
				System.out.println("Prime Number "+i+"\n");
			}
		}
	}
}

class  B extends Thread
{
	public  void run()
	{
//print given string in polindrome
		String original = "malayalam";
		String reverse="";
		char[]ch = original.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse+=ch[i];
		}
		if(original.equals(reverse))
		{
			System.out.println("Given String Is Polindrome\n");
		}
		else
			System.out.println("Given String Is Not Polindrome ");
		}
}

class  C extends Thread
{
	public  void run()
	{
//print table programe for number 8754065455
		int num = 875406545;
		for(int i=1;i<=10;i++) {
//			if(i==5)
//			{
//				stop();
//			}
			if(i>=5) {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(num+" * "+i+" = "+(num*i)+"\n");
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) {
		A a = new A();
		a.setPriority(1);
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
		

	}

}
