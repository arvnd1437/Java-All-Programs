package com.jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectToDB {
	

	public static void main(String[] args) {
		ConnectToDB contdb = new ConnectToDB();
		contdb.toDB();
		contdb.fromDB();

	}
	public void toDB() {
		try {
			//1.To load driver class,it is a software establishes connectivity b/w JAVA and DBMS
			Class.forName("org.postgresql.Driver");
			//2.To connect toDB using url,user name,password
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/arvnddb","postgres","1234");
			//3.To prepare query
			Statement stm=con.createStatement();
			//4.To executing query
//			stm.executeUpdate("insert into product values(5,'chanru')");
			 
			  Scanner sc = new Scanner(System.in); 
			  
			  int id=sc.nextInt();
			 
			   String name =sc.next();
			   stm.executeUpdate("insert into product values(" + id + ",'" + name + "');");
			
			//5.Close & Commit 
			stm.close();
			 

			con.close();
			System.out.println("Successfuly inserted!");
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void fromDB() {
		
	}
	
	
	

}
