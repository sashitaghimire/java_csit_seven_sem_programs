import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDB {

	public static Connection setConnection() {
		String databasURL = "jdbc:mysql://localhost:3306/employee_db";
		String user = "root";
		String password = "";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			try {
				conn = DriverManager.getConnection(databasURL, user, password);
				System.out.println("SQL DB Connected");
			} catch (SQLException e) {
				System.out.println("SQL Connection Error");
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exceprion");
			e.printStackTrace();

		}
		return conn;

	}
	
//	insert using prepared statement
	public void insertPrep()  {
		Connection conn = setConnection();
		if(conn !=null) {
			String sql = "INSERT INTO EmployeeTable(id, name, salary,address) values(?,?,?,?)";
			try {
				java.sql.PreparedStatement stat = conn.prepareStatement(sql);
				stat.setInt(1, 5);
				stat.setString(2, "Lionel");
				stat.setDouble(3, 49000);
				stat.setString(4, "Kathmandu");
				int i = stat.executeUpdate();
				System.out.println( i + " Record inserted using prepared statement");
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	insert
	public void insert() {
		Connection conn = setConnection();
		if (conn != null) {
			System.out.println("Connection Established to Insert Record");

			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate("INSERT into EmployeeTable(id,name,salary,address)"
						+ "values(3,'Hari Panta', 50000.0,'Dhading')");
				System.out.println("Inserted Record Successfully");

			} catch (SQLException e) {
				System.out.println("Error in Inserting data");
				e.printStackTrace();
			}

		}
	}

//	update
	public void update() {
		Connection conn = setConnection();
		if (conn != null) {
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate("UPDATE EmployeeTable SET salary=70000 WHERE id=2");
				System.out.println("Row Updated Successfully");
			} catch (SQLException e) {
				System.out.println("Error in Update");
				e.printStackTrace();
			}
		}
	}

//	update
	public void delete() {
		Connection conn = setConnection();
		if (conn != null) {
			try {
				Statement statement = conn.createStatement();
				statement.executeUpdate("DELETE FROM EmployeeTable WHERE id=2");
				System.out.println("Deleted Row Id 2 Successfully");
			} catch (SQLException e) {
				System.out.println("Error in Delete");
				e.printStackTrace();
			}
		}
	}

//	display Retrieve
	public void display() {
		Connection conn = setConnection();
		if (conn != null) {
			try {
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM EmployeeTable");
				System.out.println("Data From DB");
				while (resultSet.next()) {
//					Fetching data by column index for row 
					String data = resultSet.getString(1);
					System.out
							.println("Getting data with col index in DB for Name for Row " + resultSet.getRow() + " : " + data);
//					Fetching data by column name for row 
					 data = resultSet.getString("name");
					  System.out.println("Getting data with col name in DB for name for Row " + resultSet.getRow() + " : " + data);
					  
					  data = resultSet.getString("salary");
					  System.out.println("Getting data with col name in DB for salary for Row " +resultSet.getRow()+" : " + data);
				}
			
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
//		DemoDB.setConnection();
		DemoDB demoDb = new DemoDB();
//		demoDb.insert();
//		demoDb.update();
//		demoDb.delete();
		demoDb.display();
//		demoDb.insertPrep();

	}

}
