package mysqljdbcproject;



	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class InsertEmployee {
		
		public static void insertEmployee(Connection con, int id, String name, String email, String phoneNumber) throws SQLException {
	        String sql = "insert into employee (Id, Name, Email_Id, Phone_Number) values (?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, id);
	        ps.setString(2, name);
	        ps.setString(3, email);
	        ps.setString(4, phoneNumber);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Employee inserted successfully.");
	        } else {
	            System.out.println("Failed to insert employee.");
	        }
	        ps.close();
	    }

	}

