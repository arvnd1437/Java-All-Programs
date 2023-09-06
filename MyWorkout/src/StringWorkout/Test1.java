package StringWorkout;

public class Test1 {

	public static void main(String[] args) {//count of duplicates
		Test1 tt=new Test1();
		tt.dublicate();

	}

	private void dublicate() {
		String s[]= {"a","b","c","a","b","c","a","e"};
		int count=0;
		String a1=s[0];
		String a2=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i]==a1) {
				count++;
				a2=a1;
				a1=s[i];
			}
			else if(s[i]==a2) {
				a2=s[i];
				count++;
			}
			
		}
		System.out.println("a"+count);
		System.out.println("b"+count);
	
	}

}
