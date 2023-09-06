package Workout;

public class LeastCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=3,no2=9,big=0;
		if(no1<no2)
		{
			big=no1;
		}
		else
		{
			big=no2;
		}
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println(big);
				break;
			}
			big++;
		}

	}

}
