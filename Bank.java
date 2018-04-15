import java.io.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Bank {
	Scanner in = new Scanner(System.in);
	public void moneytransfer(String name, int landarea, String mono, String subsidy) {
		System.out.println(".........Please enter bank detials below.........");
		System.out.println("Enter name : ..........");
		String nam = in.next();
		System.out.println("Enter account no : ..........");
		String accno = in.next();
		System.out.println("Enter IFSC code : ..........");
		int ifsc = in.nextInt();
		System.out.println(".........Thank you for providing details...........");
		System.out.println("...........!!!!!!!!!!!!..........");
		System.out.println("");
		if(subsidy.compareTo("Cropsubsidy") == 0) {
			System.out.println("Rs. 1 lakh added to your bank account");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 try {
					 java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
					 Statement stmt = con.createStatement();
					 String stp = "INSERT INTO application VALUES( '" + name + "', '" + landarea + "', '" + mono + "', '" + subsidy + "', '" + "1 lakh" + "', '" + "Accepted" + "')";
					 stmt.executeUpdate(stp);
				 } catch (SQLException e) {
					 e.printStackTrace();
				 }
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(subsidy.compareTo("Infrastructuresubsidy") == 0 ) {
			System.out.println("Rs. 2 lakh added to your bank account");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 try {
					 java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
					 Statement stmt = con.createStatement();
					 String stp = "INSERT INTO farmer_data VALUES( '" + name + "', '" + landarea + "', '" + mono + "', '" + subsidy + "', '" + "2 lakh" + "', '" + "Accepted" + "')";
					 stmt.executeUpdate(stp);
				 } catch (SQLException e) {
					 e.printStackTrace();
				 }
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(subsidy.compareTo("Watersubsidy") == 0  ) {
			System.out.println("Rs. 2 lakh added to your bank account");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 try {
					 java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
					 Statement stmt = con.createStatement();
					 String stp = "INSERT INTO farmer_data VALUES( '" + name + "', '" + landarea + "', '" + mono + "', '" + subsidy + "', '" + "2 lakh" + "', '" + "Accepted" + "')";
					 stmt.executeUpdate(stp);
				 } catch (SQLException e) {
					 e.printStackTrace();
				 }
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(subsidy.compareTo("Maintainfarmsubsidy") == 0 ) {
			System.out.println("Rs. 1.5 lakh added to your bank account");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			try {
				 Class.forName("com.mysql.jdbc.Driver");
				 try {
					 java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
					 Statement stmt = con.createStatement();
					 String stp = "INSERT INTO farmer_data VALUES( '" + name + "', '" + landarea + "', '" + mono + "', '" + subsidy + "', '" + "1.5 lakh" + "', '" + "Accepted" + "')";
					 stmt.executeUpdate(stp);
				 } catch (SQLException e) {
					 e.printStackTrace();
				 }
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
