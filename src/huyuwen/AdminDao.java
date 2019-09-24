package huyuwen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import cn.itcast.fruitstore.data.DataBase;

public class AdminDao {

	///查询
	public ArrayList<User> queryAllData(User iUser) {
		Connection conn = null;//数据库连接
		PreparedStatement stmt = null;//数据库操作
		ResultSet rs = null;//定义数据库操作类
		ArrayList<User> list = new ArrayList<User>();//遍历结果集
		try {
		 conn = JDBCUtils.getConnection();//获得链接对象，用SQLSEVER数据库连接方法
			
		    String sql = "SELECT * FROM Sys_emp where name='"+iUser.getName()+"' and password='"+iUser.getPassword()+"'";//查询语句
			stmt = conn.prepareStatement(sql);//建立SQL语句的对象，对象类型为Statement接口
			rs = stmt.executeQuery();//执行SQL查询语句
			while (rs.next()) {//创建user对象
				User userItem = new User();//从数据库中得到相应字段的值
				userItem.setName(rs.getString("Name"));//获取登录用户名
				userItem.setPassword(rs.getString("password"));//获取密码
				userItem.setUpdate_Time(rs.getString("update_Time"));//获取时间
				userItem.setKeyId(rs.getInt("KeyId"));//获取唯一编号
				userItem.setStatus(rs.getBoolean("Status"));//获取登录状态
				list.add(userItem);//将查询项用户信息存放倒list用户集合中
			}
			stmt.close();//关闭操作
			conn.close();//数据库关闭
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}

	///添加
	public void addItem(User Item) {
		Connection conn = null;//数据库连接
		Statement stmt = null;//数据库操作
		ResultSet rs = null;//定义数据库操作类
		try {
			conn = JDBCUtils.getConnection();//用SQLSEVER数据库连接方法连接
			stmt = conn.createStatement();
			String sql = "INSERT INTO Sys_emp(Name,Password,Status)"
					+ "VALUES('" + Item.getName() + "','" + Item.getPassword()
					+ "','" + Item.isStatus()+ "')";
			int num = stmt.executeUpdate(sql);
			if (num > 0) {
				System.out.println("记录录入成功");
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	///删除
	public boolean delItem(String name) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean flag=false;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "DELETE FROM sys_emp WHERE name=" +"'"+name+"'";
			int num = stmt.executeUpdate(sql);
			if (num > 0) {
             flag=true;
			}
			else {
				flag=false;
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}

