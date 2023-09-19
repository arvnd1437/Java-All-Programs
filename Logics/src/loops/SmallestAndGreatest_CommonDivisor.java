package loops;

public class SmallestAndGreatest_CommonDivisor {

	public static void main(String[] args) {
		SmallestAndGreatest_CommonDivisor cd=new SmallestAndGreatest_CommonDivisor();
		cd.commanDiv(100,120);

	}

	private void commanDiv(int no1, int no2) {
		int small=no1<no2?no1:no2;
		int div=2;
		int lcd=0,gcd=0;
		boolean first=false;
		while(div<=small) {
			if(no1%div==0&&no2%div==0) {
				if(first==false) {
					lcd=div;
					first=true;
				}
				
			}
			gcd=div;
			div++;
		}
		System.out.println("GCD "+gcd);
		System.out.println("LCD "+lcd);
	}

}
