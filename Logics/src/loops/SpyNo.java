package loops;

public class SpyNo {

	public static void main(String[] args) {
		int no=1124;int sumOfDigits=0;int no1=no;
		int sukOfMuliti=1;
		while(no>0) {
			int rem=no%10;
			sumOfDigits=sumOfDigits+rem;
			sukOfMuliti=sukOfMuliti*rem;
			no=no/10;
		}
		
		if(sumOfDigits==sukOfMuliti) {
			System.out.println(no1+" is Spy no");
		}
		else
			System.out.println(no1+" is Not Spy no");
	}

}
