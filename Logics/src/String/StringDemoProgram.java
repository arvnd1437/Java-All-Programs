package String;

public class StringDemoProgram {

	public static void main(String[] args) {
		StringDemoProgram sd = new StringDemoProgram();
		//sd.demo1();//char Array to String
		//sd.demo2();
		//sd.demo3();
		//sd.demo4();
		//sd.demo5();
		sd.demo6();
		
	}

	private void demo6() {
		/*String s="Hi Nithya Ashwini";
		char [] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(ch[i]);
		}*/
		
		/*String a = String.valueOf(5);
		String b = String.valueOf(10);
		System.out.println(a+b);*/
		
		
		/*String a= "   ";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());*/
		
		/*String st = "ramkumar";
		int index = st.indexOf("r");
		int index1 = st.lastIndexOf("r");
		System.out.println(index);
		System.out.println(index1);*/
		
		/*String st = "ramkumar";
		//String st = "Ramkumar";
		st=st.replaceFirst("a", "A");
		System.out.println(st);*/
		
		String st = "Aravindh";
		String st1 = "aravindh";
		System.out.println(st.compareTo(st1));
		System.out.println(st.compareToIgnoreCase(st1));
		
		
		
	}

	private void demo5() {
		String s="Hi Nithya Ashwini";
		System.out.println(s);
		s=s.replace("Hi", "Bye");
		System.out.println(s);
		
		
	}

	private void demo4() {
		/*String s="Hi Nithya Ashwini";
		System.out.println(s.contains("Hi"));
		
		s=s.substring(2,5);
		System.out.println(s);
		
		String ss="Hi Nithya Ashwini";
		//boolean starts = ss.startsWith("Hi");
		boolean starts = ss.endsWith("Hi");
		System.out.println(starts);*/
		
		String sss="Hi Nithya Ashwini";
		String a[]=sss.split("s");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}

	private void demo3() {
		String s="   Hi Nithya Ashwini";
		System.out.println(s);
		s=s.stripLeading();
		System.out.println(s);
		
		String ss="Hi Nithya Ashwini   ";
		System.out.println(ss.length());
		System.out.println(ss);
		ss=ss.stripTrailing();
		System.out.println(ss.length());
		System.out.println(ss);
		
		String sss="    Hi Nithya Ashwini   ";
		System.out.println(sss.length());
		System.out.println(sss);
		sss=sss.trim();
		System.out.println(sss.length());
		System.out.println(sss);
		
		
		
	}

	private void demo2() {
		String name = "Nithya Ashwini";
		System.out.println(name.toUpperCase());
		System.out.println(name);
		//for(int i=0;i<name.length();i++) {
		//	char ch=name.charAt(i);
			//System.out.println(ch);
		//}
		
	}

	private void demo1() {
		char []data= {'a','b','c'};	
		String s = new String(data);
		System.out.println(s);
	}

}
