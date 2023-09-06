package Workout;

public class CommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=100,no2=150,div=2,small=0;
		if(no1<no2)
		{
			small=no1;
		}
		else
		{
			small=no2;
		}
		while(div<=small/2)
		{
			if (no1%div==0 && no2%div==0)
			{
				System.out.println(div);
			}
			div++;
		}

	}

}
