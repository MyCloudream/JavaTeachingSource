package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtils;
/**
 * 完成数据库的增删改查的操作
 * 练习：
 * 1、完成某一条数据的删除，根据用户名删除
 * 2、User user = new User("shangpeng","123456");
 * User user = new User("lishuang","lishuang123");
 */
public class TestJDBC {
	public static boolean deleteUser(int id){
		Connection conn = DBUtils.getConnection();;
		PreparedStatement ps = null;
		try {
			String sql = 
					"delete from user where id = ?";
			ps = conn.prepareStatement(sql);// 预编译的statement
			// 给sql语句中的？赋值
			ps.setInt(1, id);
			// 根据rs，如何判断是否存在这个用户
			int m = ps.executeUpdate();// 完成数据的插入、更新和删除
			return m==1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}
	
	/**
	 * 根据用户名，修改密码
	 * @param password
	 * @return
	 */
	public static boolean updatePassword(User user){
		Connection conn = DBUtils.getConnection();;
		PreparedStatement ps = null;
		try {
			String sql = 
					"update user set password = ? where username = ?";
			ps = conn.prepareStatement(sql);// 预编译的statement
			// 给sql语句中的？赋值
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getUsername());
			// 根据rs，如何判断是否存在这个用户
			int m = ps.executeUpdate();// 完成数据的插入、更新和删除
			return m==1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}
	
	public static boolean add(User user){
		Connection conn = DBUtils.getConnection();;
		PreparedStatement ps = null;
		try {
			String sql = 
					"insert into user(username,password) values(?,?)";
			ps = conn.prepareStatement(sql);// 预编译的statement
			// 给sql语句中的？赋值
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			// 根据rs，如何判断是否存在这个用户
			int m = ps.executeUpdate();// 完成数据的插入、更新和删除
			return m==1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}
	
	
	/**
	 * 完成对数据库中对应账号密码用户的查询
	 * @param user
	 * @return 是否存在该用户
	 */
	public static boolean queryUser(User user){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConnection();
			String sql = 
					"select * from user where username = ? and password = ?";
			ps = conn.prepareStatement(sql);// 预编译的statement
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			// 根据rs，如何判断是否存在这个用户
			rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return false;
	}
 	
	public static List<User> queryAll(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> list = null;
		try {
			conn = DBUtils.getConnection();;
			// 3、操作数据（增删改查）
			ps = conn.prepareStatement("select * from user");
			// 4、执行sql查询语句,得到结果集
			rs = ps.executeQuery();
			// 完成数据的取出，并封装为对象，输出对象查看数据取出是否成功
			list = new ArrayList<User>();
			while(rs.next()){// 5、结果集的遍历
				User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
				list.add(user);
			}
			// 6、关闭资源
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return list;
	}
}
