package com.jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectToDB {
	

	public static void main(String[] args) {
		ConnectToDB contdb = new ConnectToDB();
		//contdb.toDB();
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
//			  int id=8;
			 
			   String name =sc.next();
//			   String name="Raj";
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
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arvnddb","postgres","1234");
			Statement stm = con.createStatement();
			 Scanner sc = new Scanner(System.in); 
			int id=sc.nextInt();
			ResultSet rs=stm.executeQuery("select * from product where id="+id);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			rs.close();
			stm.close();
			con.close();		
		}
		catch(Exception e){
			System.out.println(e);		
		}
	}
	
}
