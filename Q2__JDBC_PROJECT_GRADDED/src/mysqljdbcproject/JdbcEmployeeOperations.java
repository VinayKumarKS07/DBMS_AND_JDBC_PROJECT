package mysqljdbcproject;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class JdbcEmployeeOperations {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String url = "jdbc:mysql://localhost:3306/GL";
	        String root = "root";
	        String password = "Vinay@12345";
	        Connection con = null;
	        int choice = 0;
	        do {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(url, root, password);

	            System.out.println("1. Insert 5 Employees' details");
	            System.out.println("2. Modify Email_Id column to varchar(30) NOT NULL");
	            System.out.println("3. Insert 2 records and check");
	            System.out.println("4. Update the name of employee Id 3 to Karthik and phone number to 1234567890");
	            System.out.println("5. Delete employee records 3 and 4");
	            System.out.println("6. Remove all records from the table employee");
	            System.out.println("7. Exit");
	            System.out.println("Enter your choice");
	            choice = Integer.parseInt(sc.nextLine());

	            switch (choice) {
	                case 1:
	                    InsertEmployee.insertEmployee(con, 1, "roop", "roop@gmail.com", "33534353");
	                    InsertEmployee.insertEmployee(con, 2, "deekshith", "deekshith@gmail.com", "346432253");
	                    InsertEmployee.insertEmployee(con, 3, "dinesh", "dinesh@gmail.com", "12345353");
	                    InsertEmployee.insertEmployee(con, 4, "gokul", "gokul.com", "32532221");
	                    InsertEmployee.insertEmployee(con, 5, "raju", "raju@gmail.com", "93543223");
	                    break;
	                case 2:
	                    ModifyEmailColumn.modifyEmailColumn(con);
	                    break;
	                case 3:
	                    InsertEmployee.insertEmployee(con, 6, "ramesh", "ramesh@gmail.com", "76543222");
	                    InsertEmployee.insertEmployee(con, 7, "suresh", "suresh@gmail.com", "876754332");
	                    break;
	                case 4:
	                    UpdateEmployee.updateEmployee(con, 3, "Karthik", "1234567890");
	                    break;
	                case 5:
	                    DeleteEmployee.deleteEmployee(con, 3);
	                    DeleteEmployee.deleteEmployee(con, 4);
	                    break;
	                case 6:
	                    RemoveAllEmployees.removeAllEmployees(con);
	                    break;
	                case 7:
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (con != null) con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        } while (choice != 7);
	    }
	        
	}
	
	
	


