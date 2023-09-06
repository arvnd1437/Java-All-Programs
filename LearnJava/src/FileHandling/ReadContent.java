package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadContent {

	public static void main(String[] args) throws IOException {
		ReadContent rc = new ReadContent();
		rc.test1();
		//rc.test2();
		//rc.test3();
		//rc.test4();//find words count
		//rc.test5();//find vowels
		//rc.test6();
		
		
	}

	private void test6() throws IOException {
		try {
			FileReader reader = new FileReader("output.txt");
			int data=reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}


	private void test5() {
		// TODO Auto-generated method stub
		int count=0;
		String s=" ";
		try {
			FileReader fr = new FileReader("//java1//FileIO//Untitled Document.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				s =s+(char)i;
				if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
				{
				count++;
				
				}
				
			}
			
		} catch (IOException e) {
			System.out.println("Worng code"+e);
			// e.printStackTrace();
			
		}
		System.out.println(s);
		System.out.println(count);
		
	}

	private void test4() {
		// TODO Auto-generated method stub
		int count=1;
		String s=" ";
		try {
			FileReader fr = new FileReader("//java1//FileIO//Untitled Document.txt");
			//FileReader fr = new FileReader("//java1//FileIO//Untitled Document.pdf");
			
			int i=0;
			while((i=fr.read())!=-1) {
				//System.out.print((char)i);
				//System.out.print(i+" ");
				if(i==' ')
				{
				count++;
				}
				s =s+(char)i;
			}
			System.out.println(count);
		} catch (IOException e) {
			//System.out.println("Worng code"+e);
			// e.printStackTrace();
			
		}
		System.out.println(s);
	}

	

	private void test3() {
		String s=" ";
		try {
			FileReader fr = new FileReader("//java1//FileIO//Untitled.txt");
			BufferedReader br = new BufferedReader(fr);
			
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			System.out.println("Worng code"+e);
			
		}
		
		
	}

	private void test2() {
		
		try {
			FileReader fr = new FileReader("//java1//FileIO//Untitled Document.txt");
			
			
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
				
				System.out.print(i+" ");
				
			}
		} catch (IOException e) {
			System.out.println("Worng code"+e);
			// e.printStackTrace();
			
		}
		
	}

	private void test1() {
		String s=" ";
		try {
			FileReader fr = new FileReader("//java1//FileIO//Untitled Document.txt");
			//FileReader fr = new FileReader("//java1//FileIO//Untitled Document.pdf");
			
			int i=0;
			while((i=fr.read())!=-1) {
				//System.out.print((char)i);
				//System.out.print(i+" ");
				
				s =s+(char)i;
			}
			
		} catch (IOException e) {
			//System.out.println("Worng code"+e);
			// e.printStackTrace();
			
		}
		System.out.println(s);
	}



}
