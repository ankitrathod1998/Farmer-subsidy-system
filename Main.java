import java.io.*;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Connection;

public class Main {
	public static void main(String[] args) {
	   	 Scanner in = new Scanner(System.in);
	   	 while(true) {
	   		 System.out.println("Press 1 : Sign up");
	   		 System.out.println("Press 2 : Login");
	   		 int test = in.nextInt();
	   		 if( test == 1 ) {
	   			 System.out.println("Choose User ID: ID should start with 10 : for farmer, 20 : for Distributors");
	   			 int id = in.nextInt();
	   			 String st = Integer.toString(id);
	   			 if((st.charAt(0) != '1' && st.charAt(0) != '2') ||  st.charAt(1) != '0') {
	   				System.out.println("Invalid UserID : (");
	   				System.out.println("...........!!!!!!!!!!!!..........");
	   				System.out.println("");
	   				continue;
	   			 }
	   			 System.out.println("Enter Password : (Minimum length 6 character)");
	   			 String password = in.next();
	   			 if(password.length() < 6) {
	   				System.out.println("Invalid Password");
	   				System.out.println("...........!!!!!!!!!!!!..........");
	   				System.out.println("");
	   				continue;
	   			 }
	   			try {
	   				Class.forName("com.mysql.jdbc.Driver");
	   				try {
	   					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
	   					PreparedStatement stmt = con.prepareStatement("SELECT * FROM user_data WHERE (User_ID = '" + id + "')"); 
	   					ResultSet rs = stmt.executeQuery();
	   					int cp = 0;
	   					while(rs.next()) {
	   						cp++;
	   					}
	   					if(cp > 0) {
	   						System.out.println("User ID already exist");
	   						System.out.println("...........!!!!!!!!!!!!..........");
	   		   				System.out.println("");
	   						continue;
	   					}
	   				} catch (SQLException e) {
	   					e.printStackTrace();
	   				}
	   			} catch (ClassNotFoundException e) {
	   				e.printStackTrace();
	   			}
	   			 System.out.println("Enter Name : ............");
	   			 String name = in.next();
	   			 System.out.println("Enter DOB : .........( Format : dd/mm/yyyy)");
	   			 String dob = in.next();
	   			 System.out.println("Enter village : ............");
	   			 String village = in.next();
	   			 System.out.println("Enter mobile no : .............");
	   			 String mono = in.next();
	   			 System.out.println("You are Succesfully Sign up ..........!!!!!!!!!");
	   			 System.out.println("...........!!!!!!!!!!!!..........");
	   			 System.out.println("");
	   			 try {
	   				 Class.forName("com.mysql.jdbc.Driver");
	   				 try {
	   					 java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
	   					 if(st.charAt(0) == '1') {
	   						 Statement stmt = con.createStatement();
	   						 String stp = "INSERT INTO farmer_data VALUES( '" + id + "', '" + password + "', '" + name + "', '" + dob + "', '" + village + "', '" + mono + "')";
	   						 stmt.executeUpdate(stp);
	   						 stp = "INSERT INTO user_data VALUES( '" + id + "', '" + password + "')";
	   						 stmt.executeUpdate(stp);
	   				 	 }
	   					 else {
		   					 Statement stmt = con.createStatement();
	   						 String stp = "INSERT INTO distributor_data VALUES( '" + id + "', '" + password + "', '" + name + "', '" + dob + "', '" + village + "', '" + mono + "')";
	   						 stmt.executeUpdate(stp);
	   						 stp = "INSERT INTO user_data VALUES( '" + id + "', '" + password + "')";
	   						 stmt.executeUpdate(stp);
	   					 }
	   				 } catch (SQLException e) {
	   					 e.printStackTrace();
	   				 }
	   			} catch (ClassNotFoundException e) {
	   				e.printStackTrace();
	   			}
	   		 }
	   		 else if( test == 2 ) {
	   			 System.out.println("Enter User ID: ..........");
	   			 int id = in.nextInt();
	   			 System.out.println("Enter Password: ...........");
	   			 String password = in.next();
	   			 Login lg = new Login();
	   			 String auth = lg.authenticate(id, password);
	   			 if(auth == "1"){ 
	      			 System.out.println("Invalid User");
	      			 System.out.println("...........!!!!!!!!!!!!..........");
	   					System.out.println("");
	      			 continue;
	      		 }
	      		 else if(auth == "0"){
	      			 System.out.println("Invalid Password, please check if your caps lock is on");
	      			 System.out.println("...........!!!!!!!!!!!!..........");
	   				 System.out.println("");
	      			 continue;
	      		 }
	      		 else {
	      			 switch(auth) {
	      			 	case "Farmer":
	      			 		Farmer f = new Farmer();
	      			 		while(true) {
	      			 			f.showMethods();
	      			 			int t = in.nextInt();
	      			 			if( t == 0 ) {
	      			 				System.out.println("You have successfully logged out");
	      			 				System.out.println("...........!!!!!!!!!!!!..........");
	      			   				System.out.println("");
	      							break;
	      			 			}
	      			 			f.selectMethod(t);
	      			 		}
	      				break;
	      			 	case "Distributor":
	      			 		Distributor d = new Distributor();
	      			 		while(true) {
	      			 			d.showMethods();
	      			 			int t = in.nextInt();
	      			 			if( t == 0 ) {
	      			 				System.out.println("You have successfully logged out");
	      			 				System.out.println("...........!!!!!!!!!!!!..........");
	      			   				System.out.println("");
	      							break;
	      			 			}
	      			 			d.selectMethod(t);
	      			 		}
	      				break;
	      			 }
	      		 }
	   		 }
	   		 else {
	   			System.out.println("Invalid Input");
	   		 }
	   	 }
	}
}
