package mysqljdbcproject;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class UpdateEmployee {
	    public static void updateEmployee(Connection con, int id, String name, String phoneNumber) throws SQLException {
	        String sql = "UPDATE employee SET Name = ?,"
	        		+"Phone_number = ?"
	        		+"WHERE Id = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setString(2, phoneNumber);
	        ps.setInt(3, id);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Employee updated successfully.");
	        } else {
	            System.out.println("Failed to update employee.");
	        }
	        ps.close();
	    }
	}
	


