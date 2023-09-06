package Workout;

public class CountOfDivision {
	public static void main(String[] args) {
		CountOfDivision cd = new CountOfDivision();
		//cd.find_division(100);
		//cd.find_division(1234);
		cd.find_division(3764);
		
	}

	private void find_division(int no) {
		int div=2;
		while(div<=no/2) {
			if(no%div==0) {
				System.out.println(div);
			}
			div++;
		}
		
	}

}
