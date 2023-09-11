package Com.pkg.PT;

public class PTonForM {

	public static void main(String[] args) {
		PTonForM pt = new PTonForM();
		//pt.test_1_manual();
		//pt.test_2_auto();
		pt.stringmanul();
		
		
		
	
	}

	private void stringmanul() {
		// TODO Auto-generated method stub
		/*long startTime=System.currentTimeMillis();
		StringBuffer sb =new StringBuffer("java");
		for(int i=0;i<=1000000;i++) {
			sb.append("Program");
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime+"ms");*/
		
		long startTime=System.currentTimeMillis();
		StringBuilder sb =new StringBuilder("java");
		for(int i=0;i<=1000000;i++) {
			sb.append("Program");
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime+"ms");
		
	}

	private void test_2_auto() {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		int x=10;
		for(int i=1;i<=x;i++) {
			System.out.println(i);
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime+"millis");
	}

	private void test_1_manual() {
		// TODO Auto-generated method stub
		int x=10;
		
				for(int i=1;i<=x;i++) {
					System.out.println(i);
				}
	}

}
