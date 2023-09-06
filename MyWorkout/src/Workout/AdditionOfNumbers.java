package Workout;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		AdditionOfNumbers an = new AdditionOfNumbers();
		an.addition(5);
		an.addition(100);
		an.addition(2);

	}

	private void addition(int no) {
		int add = 0;
		while(no>0) {
			add = add+no;
			no--;
		}
		System.out.println(add);
		
	}

}
