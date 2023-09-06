package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContent {

	public static void main(String[] args) {
		WriteContent wc = new WriteContent();
	//	wc.demo1();
	//	wc.demo2();
		wc.demo3();
	}

	private void demo3() {
		try {
			FileWriter w = new FileWriter("output.txt");
			String content = "i love my contry";
			w.write(content);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void demo2() {
		try
		{
			FileWriter fw = new FileWriter("//home//arvnd//Desktop//Write1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Asalt Aravindh"+"\n");
			bw.write("Sampavam Saravna"+"\n");
			bw.write("Compiler Chandru"+"\n");
			bw.close();
			System.out.println("Success");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	private void demo1() {
		try
		{
		FileWriter fw = new FileWriter("//home//arvnd//Desktop//Write.txt",true);
		String s=" asaltu aravidh";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
