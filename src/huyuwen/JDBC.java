package huyuwen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	 Connection con = null; 
	 Statement stmt = null; 
	 ResultSet rs = null; 
	
	
	public void Connection(String user) {
		// TODO 自动生成的方法存根
		try {
			String url = "jdbc:sqlserver://192.168.199.198\\SQLEXPRESS;databaseName=tongji;user=sa;password=abc.123";//sa身份连接 
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			con = DriverManager.getConnection(url); 
			
			String sql = "select * from sys_emp where Name = ?";
			//传递 SQL 语句
            PreparedStatement statement = con.prepareStatement(sql);
            //设置 SQL 语句中占位符的值
            statement.setString(1, user);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("UserName = " + resultSet.getString("Name"));
                System.out.println("PassWord = " + resultSet.getString("PassWord"));
            }
            resultSet.close();
            statement.close();

		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
