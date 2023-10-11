package LearnEnum;

public class EnumDemo {

	public static void main(String[] args) {
		EnumDemo ed=new EnumDemo();
		ed.demo1();

	}

	private void demo1() {
		enum Level{
			low,
			medium,
			high
		}
		Level l=Level.low;
		System.out.println(l);
//		System.out.println(Level.low);
		
	}

}
