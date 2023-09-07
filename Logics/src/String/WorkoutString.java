package String;

public class WorkoutString {
	public static void main(String []args) {
		WorkoutString ws=new WorkoutString();
		//ws.work1();
		ws.work2();
		
		
	}

	private void work2() {
		String s="aravindh ayyadurai arun";//AravindH AyyaduraI AruN
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1)
			{
				if(ch>='a'&&ch<='z')
				System.out.print((char)(ch-32));
			}
			else if(ch==' ')
			{
				System.out.print(ch);
				i++;
				ch=s.charAt(i);
				if(ch>='a'&&ch<='z')
					System.out.print((char)(ch-32));
			}
			else
			{
			int	j=i+1;
				if(j<=s.length()-1 && s.charAt(j)==' ')
				{
					if(ch>='a'&&ch<='z')
						System.out.print((char)(ch-32));
				}
				else
					System.out.print(ch);
			}
		}
			
				
		
	}

	private void work1() {
		String s="aravindh ayyadurai arun";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(i==0 || i==s.length()-1) 
			{
				if(ch>='a' && ch<='z') 
				{
				System.out.print((char)(ch-32));
				}
			}
			else if(ch==' ')
			{
				System.out.print(' ');
				i++;
				//ch = s.charAt(i);
				if(ch>='a' && ch<='z')
				{
					System.out.print((char)(ch-32));
				}
			}
			else
			{
				int j=i+1;
				if(j<s.length() &&s.charAt(j)==' ')
				{
					if(ch>='a' && ch<='z')
					{
						System.out.print((char)(ch-32));
					}	
				}
				else
				System.out.print(ch);
			}
		}
		
	}

}
