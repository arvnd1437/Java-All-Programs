package InterFace;

public interface Smartphone {
	void display();
	void call();
	void videoCall();
	void internet();
}
	class Samsung implements Smartphone{
		public static void main(String[]args) {
			
		}

		@Override
		public void display() {
			int a=1,b=2;
			int c=a+b;
			System.out.println(c);
			
		}

		@Override
		public void call() {
			int a=1,b=2;
			int c=a+b;
			System.out.println(c);
			
		}

		@Override
		public void videoCall() {
			int a=1,b=2;
			int c=a+b;
			System.out.println(c);
			
		}

		@Override
		public void internet() {
			int a=1,b=2;
			int c=a+b;
			System.out.println(c);
			
		}
	
	


}

