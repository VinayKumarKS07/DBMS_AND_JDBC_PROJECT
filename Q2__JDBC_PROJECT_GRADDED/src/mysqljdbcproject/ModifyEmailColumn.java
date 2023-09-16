package mysqljdbcproject;



	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class ModifyEmailColumn {

		public static void modifyEmailColumn(Connection con) throws SQLException {
	        String sql = "alter table employee modify Email_Id varchar(30) not null";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.executeUpdate();
	        System.out.println("Email_Id column modified successfully.");
	        ps.close();
	    }

		
	}


