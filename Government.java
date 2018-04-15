import java.io.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Government {
	Scanner in = new Scanner(System.in);
	public void responseofappl(String name, int landarea, String mono, String subsidy) {
		System.out.println("Name : " + name);
		System.out.println("Mobile no : " + mono);
		System.out.println("Land Area : " + landarea);
		System.out.println("Subsidy Type : " + subsidy);
		Subsidy s = new Subsidy();
		if(s.checkavailability(subsidy, landarea)) {
			System.out.println("Congratulations your subsidy application is accepted...!!!");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			Helpcenter h = new Helpcenter();
			h.subsidyprovider(name, landarea, mono, subsidy);
		}
		else {
			System.out.println("We ara Sorry your application did not match our requirement :(");
			System.out.println("...........!!!!!!!!!!!!..........");
			System.out.println("");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				try {
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
					Statement stmt = con.createStatement();
					String stp = "INSERT INTO application VALUES( '" + name + "', '" + landarea + "', '" + mono + "', '" + subsidy + "', '" + "0" + "', '" + "rejected" + "')";
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
