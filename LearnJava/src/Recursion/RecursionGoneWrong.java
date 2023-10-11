package Recursion;

public class RecursionGoneWrong {
	//it is a bad practice of recursion
	
	void display() {
		System.out.println("Helow World");
		display();
	}

	public static void main(String[] args) {
		RecursionGoneWrong re=new RecursionGoneWrong();
		re.display();
		

	}
	
	

}
