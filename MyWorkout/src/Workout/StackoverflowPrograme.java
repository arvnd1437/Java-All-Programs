package Workout;

public class StackoverflowPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackoverflowPrograme st=new StackoverflowPrograme();
		st.display(1);

	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no++;
		if(no<=5)
		display(no);
	}

}
