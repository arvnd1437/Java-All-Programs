package String;

public class WorkoutString {
	public static void main(String []args) {
		WorkoutString ws=new WorkoutString();
		//ws.work1();
		//ws.work2();
		ws.work3();
		
		
	}

	private void work3() {
		String s = "    How are You      ";
		int start=0,end=s.length()-1;
		boolean first = false,last=false;
		for(int i =0; i<s.length(); i++)
		{
			if(s.charAt(i)==' '&& first==false)
			{
				start++;
			}
			else
			{
				first=true;
			}
			if(s.charAt(end)==' '&& last==false)
			{
				end--;
			}
			else
			{
				last=true;
			}
			if(first==true && last==true)
			{
			for(int j=start; j<=end; j++)
			{
				System.out.print(s.charAt(j));
				
			}
			break;
			}
		}
	
	}

	private void work2() {
		String s1="Today is Thursday";
		String s2="day";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s2.charAt(0)==s1.charAt(i)) 
			{
				int count=0;
				for(int j=0; j<s2.length();j++)
				{
					if(s2.charAt(j)==s1.charAt(i))
					{
						count++;
						i++;
					}
				}
				if(count==s2.length()) 
				{
					System.out.println("Yes Contains");
					break;
				}
				else 
					System.out.println("Doesn't Contains");
				break;
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
