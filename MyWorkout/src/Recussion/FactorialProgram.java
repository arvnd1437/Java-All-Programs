package Recussion;

public class FactorialProgram {
	public static void main(String []args) {
		FactorialProgram fp=new FactorialProgram();
		fp.find_factial(1);
	}

	private int find_factial(int no) {
		// TODO Auto-generated method stub
		if(no==1) {
			return 1;
		}
		else
		{
			return no * find_factial(no-1);
		}
		
		
	}

}
