package Workout;

public class ContinueKeywordPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10)
		{
			if(no%2==0) {
				no++;
				continue;
			}
			System.out.println(no);
			no++;
		}

	}

}
