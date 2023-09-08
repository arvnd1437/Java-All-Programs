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
		//sd.demo7();
		//sd.demo8();//predefined method
		//sd.demo9();//stripleading
		//sd.demo10();//stripTrailing()
		//sd.demo11();
		//sd.demo12();
		//sd.demo13();//Remove unwanted Spaces
		//sd.demo14();
		sd.demo15();//Reveres word
		
		
	}
	

	

	private void demo14() {
		String s ="How      are     you";
		boolean space = true;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
				space =false;
			}
			else if(space==false)
			{
				System.out.print(s.charAt(i));
				space=true;
			}
		}
	}

	private void demo13() {
		String s ="How      are     you";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i));
				{
					for(int j=i; j<s.length(); j++)
					{
						if(s.charAt(j)==' ') {
							continue;
						}
						else
						{
							i=j-1;
							break;
						}
					}
				}
			}
		}
	}

	private void demo12() {
		String s1 = "Today is Thursday";
		String s2= "day";
		for(int i=0; i<s1.length(); i++)
		{
			if(s2.charAt(0)==s1.charAt(i))
			{
				int count=0;
				for(int j=0; j<s2.length(); j++)
				{
					if(s2.charAt(j)==s1.charAt(i))
					{
						count++;
						i++;
					}
				}
				if(count == s2.length())
				{
					System.out.println("Yes Contains");
					break;
				}
				else
					System.out.println("Doesn't contains");
				 break;
			}
		}
		
		
	}

	private void demo11() {
		String s = "     how are you              ";
		int start=0,end=s.length()-1;
		boolean first=false,last=false;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)==' ' && first==false)
			{
				start++;
			}
			else
			{
				first=true;
			}
			if(s.charAt(end)==' ' && last==false)
			{
				end--;
			}
			else
			{
				last=true;
			}
			if(first==true && last==true)
			{
				for(int j=start; j<=end;j++)
				{
					System.out.print(s.charAt(j));
				}
				break;
			}
		}
		
	}

	private void demo10() {
		String s = "How Are you    ";
		//System.out.println(s);
		
		int last=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ') {
				last=i;
				break;
			}
		}
		
		for(int i=0; i<=last; i++)
		{
			System.out.print(s.charAt(i));
		}
	
	}

	private void demo9() {
		/*//predefined method
		String s = "  How";
		System.out.println(s);
		s =s.stripLeading();
		System.out.println(s);
		*/
		
		///stripleading
		String s = "  How Are you";
		boolean first=false;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ' && first==false)
			{
				continue;
			}
			else
			{
				first=true;
				System.out.print(s.charAt(i));
			}
		}
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
