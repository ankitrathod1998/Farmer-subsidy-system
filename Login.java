import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Login {
	public static  String authenticate(int id,String password){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmer_Subsidy_System","root","");
				PreparedStatement stmt = con.prepareStatement("SELECT * FROM user_data"); 
				ResultSet rs = stmt.executeQuery();
				int flag = 0;
				while(rs.next()){
					if(rs.getInt(1) == id){
						flag = 1;
						if(rs.getString(2).compareTo(password) == 0){
							int p = (rs.getInt(1))/1000;
							if(p == 100)
								return "Farmer";
							else
								return "Distributor";
						}
						else
							return "1";
					}
				}
				if(flag == 0)
					return "0";
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
