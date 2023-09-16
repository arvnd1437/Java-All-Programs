package loops;

public class PerfectNo {

	public static void main(String[] args) {
		int no=6,div=1,perfect=0;
		while(div<=no/2) {
			if(no%div==0) {
				perfect+=div;
			}
			div++;
		}
		if(no==perfect) {
			System.out.println(no+" is Perfect No");
		}
		else
			System.out.println(no+" is Not Perfect No");
		
		

	}

}
