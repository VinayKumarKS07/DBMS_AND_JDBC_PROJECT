package mysqljdbcproject;



	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DeleteEmployee {
		
		public static void deleteEmployee(Connection con, int id) throws SQLException {
	        String sql = "delete from employee WHERE Id = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, id);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Employee deleted successfully.");
	        } else {
	            System.out.println("Failed to delete employee.");
	        }
	        ps.close();
	    }

	}
	

