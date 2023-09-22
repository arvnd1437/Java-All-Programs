package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteJavaProgramInConsole {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  try {
	   FileWriter fw =new FileWriter("/home/arvnd/eclipse-workspace/File/ara/wirtejava.java");
	   BufferedWriter bw= new BufferedWriter(fw);
	    bw.write("public static void main(String args[])"+"\n");
	    bw.write("{"+"\n");
	    bw.write("int sum(int a= 5,int b= 5) "+"\n");
	    bw.write("{"+"\n");
	    bw.write("int c=a+b;"+"\n");
	    bw.write("System.out.println(c);"+"\n");
	    bw.write("}"+"\n");
	    bw.close();
	    fw.close();
	   System.out.println("sucees"); 
	   
	   }
	 catch(Exception e) {
	  System.out.println(e);
	 }
	  

	 }

	}

