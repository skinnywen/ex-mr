package huyuwen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 */
public class JDBCUtils {

	public static Connection getConnection()  
	{
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		String url = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS;databaseName=tongji;user=sa;password=abc.123";
		 conn = DriverManager.getConnection(url);
		
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return conn;
	}
}
