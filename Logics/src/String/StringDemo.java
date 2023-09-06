package String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd = new StringDemo();
		//sd.demo1();// given string convert to lower case without predefined method
		//sd.demo2();
		//sd.demo3();//given string convert to upper case without predefined method
		//sd.demo4();
		//sd.demo5();
		//sd.demo6();
		sd.demo7();
		//sd.demo8();//predefined method
		
		
		
	}

	private void demo8() {
		String s= "aravindh ayyadurai arun";
		String[] st=s.split(" ");
		for(int i=0; i<st.length;i++)
		{
			String name =st[i];
			System.out.print((char)(name.charAt(0)-32));
			String name2=name.substring(1,name.length()-1);
			System.out.print(name2);
			System.out.print((char)(name.charAt(name.length()-1)-32)+" ");
		}
		
	}

	private void demo7() {
		// TODO Auto-generated method stub
		String s = "aravindh ayyadurai arun";
		for(int i=0;i<s.length();i++) 
		{
		char ch =s.charAt(i);
		if(i==0 || i==s.length()-1) 
		{
		if(ch>='a' && ch<='z')
		System.out.print((char)(ch-32));
		}
		else if(ch==' ') {
			System.out.print(ch);
			i++;
		ch =s.charAt(i);
		if(ch>='a' && ch<='z')
			System.out.print((char)(ch-32));
		}
		else
		{
			int j=i+1;
			if(j<s.length() && s.charAt(j)==' ')
			{
				if(ch>='a' && ch<='z')
					System.out.print((char)(ch-32));
			}
			else	
				System.out.print(ch);
		}
			
		}
		
	}

	private void demo6() {
		// TODO Auto-generated method stub
		String s = "aravindh ayyadurai";
		for(int i=0;i<s.length();i++) 
		{
		char ch =s.charAt(i);
		if(i==0) 
		{
		if(ch>='a' && ch<='z')
		System.out.print((char)(ch-32));
		}
		else if(ch==' ') {
			System.out.print(ch);
			i++;
		ch =s.charAt(i);
		if(ch>='a' && ch<='z')
			System.out.print((char)(ch-32));
		}
		else
			System.out.print(ch);
		}
		
	}

	private void demo5() {
		// TODO Auto-generated method stub
		String s = "aravindh";
		for(int i=0;i<s.length();i++) 
		{
		char ch =s.charAt(i);
		if(i==0||i==s.length()-1||i==s.length()/2) 
		{
		if(ch>='a' && ch<='z')
		System.out.print((char)(ch-32));
		}
		else
			System.out.print(ch);
		}
		
		
	}

	private void demo4() {
		String s = "aravindh";
		for(int i=0;i<s.length();i++) 
		{
		char ch =s.charAt(i);
		if(i%2==0) 
		{
		if(ch>='a' && ch<='z')
		System.out.print((char)(ch-32));
		}
		else
			System.out.print(ch);
		}
		
	}

	private void demo3() {
		// TODO Auto-generated method stub
		String s = "abcd1234%$^";
		for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='a' && ch<='z')
		System.out.print((char)(ch-32));
		else
			System.out.print(ch);
		}
		
	}

	private void demo2() {
		// TODO Auto-generated method stub
		String s = "ABCD1234%@#";
		for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		if(ch>='A' && ch<='Z')
		System.out.print((char)(ch+32));
		else
			System.out.print(ch);
		}
	}

	private void demo1() {
		String s = "ABCD";
		for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		System.out.print((char)(ch+32));
		}
	}

}
