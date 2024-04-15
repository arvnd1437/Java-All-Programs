package loops;

import java.util.Scanner;

public class AmstrongNO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your no:");
		int number=scanner.nextInt();
		scanner.close();
		if(isArmstrongNumber(number)) {
			System.out.println("is amrstrong no");
		}
		else
			System.out.println("is not amrstrong no");
	}

	private static boolean isArmstrongNumber(int num) {
		int originalNum=num;
		int numOfDigits=countOfDigit(num);
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+power(digit,numOfDigits);
			num=num/10;
		}
		return originalNum==sum;
	}

	static int countOfDigit(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}

	static int power(int base, int power) {
		int result=1;
//		for(int i=0;i<power;i++) {
//			result=result*base;
//		}
		while(power>0) {
			result=result*base;
			power--;
		}
		
		return result;
	}
}
