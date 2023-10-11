package String;

public class ReverseStringRam {
	
	public static void main(String[] args) {
		String s="Java";
		char c[]=s.toCharArray();
		for(int i=0; i<c.length/2;i++) {
			char temp=c[i];
			c[i]=c[c.length-i-1];
			c[c.length-i-1]=temp;
		}
		System.out.println(c);

	}

}
