package cn.ucai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.bean.Contact;
import cn.ucai.bean.User;
import cn.ucai.utils.DBUtils;

public class DaoImpl implements IDao {

	@Override
	public boolean existUser(User user) {// SQL语句的编写和运行 （JDBC）
		Connection conn = DBUtils.getConnection();
		String sql = "select * from user where userName = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,user.getUserName());
			rs =  ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return false;
	}

	@Override
	public boolean insertUser(User user) {
		Connection conn = DBUtils.getConnection();
		String sql = "insert into user(userName,nick,password) values(?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getNick());
			ps.setString(3, user.getPassword());
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}

	@Override
	public User findUser(User user) {
		Connection conn = DBUtils.getConnection();
		String sql = "select * from user where userName = ? and password = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		User u = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,user.getUserName());
			ps.setString(2, user.getPassword());
			rs =  ps.executeQuery();
			while(rs.next()){
				u = new User();
				int id = rs.getInt("id");
				String userName = rs.getString("userName");
				// ......未完待续
				u.setId(id);
				u.setUserName(userName);
				// ......未完待续
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return u;
	}

	@Override
	public List<Contact> getAllFriendsId(String userName, int pageId, int pageSize) {
		Connection conn = DBUtils.getConnection();
		String sql = "select * from contact where myuid = (select id from user where userName = ?) limit ?,?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Contact> list = new ArrayList<Contact>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,userName);
			ps.setInt(2, pageId*pageSize);
			ps.setInt(3, pageSize);
			rs =  ps.executeQuery();
			while(rs.next()){
				Contact contact = new Contact();
				int id = rs.getInt("id");
				// ......未完待续
				contact.setId(id);
				// ......未完待续
				contact.setResult("ok");
				list.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return list;
	}

	@Override
	public boolean updateUserAvatar(String userName) {
		Connection conn = DBUtils.getConnection();
		String sql = "update user set avatar = ? where userName = ?" ;
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "user_avatar/"+userName+".jpg");
			ps.setString(2, userName);
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;		
	}

}
