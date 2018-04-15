import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Feedback {
	public void question() {
		System.out.println("Put your Question/Suggestion");
		Scanner scanner = new Scanner(System.in);
		String que = scanner.nextLine();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
				Statement stmt = con.createStatement();
				String stp = "INSERT INTO feedback VALUES( '" + que + "', '')";
				stmt.executeUpdate(stp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
