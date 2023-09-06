package Workout;

public class StaticMethod {


		int roll_no;//instance variable
		
		String nname;
		
		static String collage_name = "DSEC";//static variable can't changed
		
		StaticMethod(int roll,String name)//constructor
		{
			roll_no=roll;
			nname = name;
		}
		void display()
		{
			System.out.println(roll_no+" "+nname+" "+collage_name);
		}
		public static void main(String[] args) 
		{
			StaticMethod s1=new StaticMethod(111,"karan");
			StaticMethod s2=new StaticMethod(222,"arun");
			StaticMethod s3=new StaticMethod(333,"arvnd");
		
		}

}
