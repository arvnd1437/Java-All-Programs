package loops;

public class demoPrograme {

	public static void main(String[] args) {
		demoPrograme dp=new demoPrograme();
		dp.demo1();		
		
	}

	private void demo1() {
		for(int no=1;no<=100;no++) {
			if(no%5==0&&no%10!=0) {
				System.out.println(no);
			}
			if(no/5==10||no/5==11) {
				System.out.println(no);
			}
		}
	}

}
