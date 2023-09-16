package mysqljdbcproject;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class RemoveAllEmployees {
		public static void removeAllEmployees(Connection con) throws SQLException {
	        String sql = "delete from employee";
	        PreparedStatement ps = con.prepareStatement(sql);
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("All employees removed successfully.");
	        } else {
	            System.out.println("Failed to remove all employees.");
	        }
	        ps.close();
	    }
		
}

