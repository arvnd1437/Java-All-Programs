package loops;

public class NestedAlphapet {
	public static void main(String[]args )
	{
		/*for(char row='A';row<='D';row++)
		{
			for(char col='A'; col<=row; col++) 
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		
		char word='A';
		for(char row='A';row<='D';row++)
		{
			for(char col='A'; col<=row; col++) 
			{
				System.out.print(word+" "); word++;
			}
			System.out.println();
		}
	}

}
