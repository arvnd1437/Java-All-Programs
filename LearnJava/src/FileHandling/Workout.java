package FileHandling;

/*import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class A extends Thread
{
	public void run()
	{
		try {
			FileWriter fw = new FileWriter("/home/arvnd/Desktop/Untitled Folder/FileIO&MT/write.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("I am aravindh\n");
			bw.write("I am from kumbakonam\n");
			bw.write("I completed my BE in perambalur and diploma in kumbakonam\n");
			bw.write("now am studying java in chennai\n");
			bw.flush();
			bw.close();
			System.out.println("write done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Worng code"+e);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try {
			FileReader fw=new FileReader("/home/arvnd/Desktop/Untitled Folder/FileIO&MT/write.txt");
			int i=0;
			while((i=fw.read())!=-1)
			{
				//System.out.print((char)i);
				//System.out.println(i+" ");
			}
			System.out.println("read done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Worng code"+e);
		}	
	}	
}
public class Workout {
	
	public static void main(String[] args) {
	A a = new A();
	a.start();
	B b = new B();
	b.start();	
	}
}*/


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class A extends Thread
{
	public  void  run() 
	{
		try {
			FileWriter fw = new FileWriter("/home/arvnd/Desktop/Untitled Folder/FileIO&MT/write.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("I am aravindh\n");
			bw.write("I am from kumbakonam\n");
			bw.write("I completed my BE in perambalur and diploma in kumbakonam\n");
			bw.write("now am studying java in chennai\n");
			bw.flush();
			bw.close();
			System.out.println("write done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Worng code"+e);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try {
			FileReader fw=new FileReader("/home/arvnd/Desktop/Untitled Folder/FileIO&MT/write.txt");
			int i=0;
			while((i=fw.read())!=-1)
			{
				//System.out.print((char)i);
				//System.out.println(i+" ");
			}
			System.out.println("read done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Worng code"+e);
		}	
	}	
}
public class Workout {
	
	public static void main(String[] args) {
	A a = new A();
	a.start();
	B b = new B();
	b.start();	
	c.
	}
}

