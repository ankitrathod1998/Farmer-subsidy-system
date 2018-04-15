import java.io.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Helpcenter {
	public void nearbyhelpcenter(String village) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
				PreparedStatement stmt = con.prepareStatement("SELECT * FROM distributor_data WHERE Village = '" + village + "'"); 
				ResultSet rs = stmt.executeQuery();
				int tp = 0;
				while(rs.next()) {
					tp++;
					System.out.println("Name : " + rs.getString(3));
					System.out.println("DOB : " + rs.getString(4));
					System.out.println("Village : " + rs.getString(5));
					System.out.println("Mobile No. : " + rs.getString(6));
					System.out.println("...........!!!!!!!!!!!!..........");
					System.out.println("");
				}
				if(tp == 0) {
					System.out.println("We are Sorry there is no any distributor in your area");
					System.out.println("...........!!!!!!!!!!!!..........");
					System.out.println("");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void subsidyprovider(String name, int landarea, String mono, String subsidy) {
		Bank b = new Bank();
		b.moneytransfer(name, landarea, mono, subsidy);
	}
}
