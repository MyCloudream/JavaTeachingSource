package cn.ucai.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.ucai.bean.User;
import cn.ucai.util.DBUtils;
/**
 * ������ݿ����ɾ�Ĳ�Ĳ���
 * ��ϰ��
 * 1�����ĳһ�����ݵ�ɾ���������û���ɾ��
 * 2��User user = new User("shangpeng","123456");
 * User user = new User("lishuang","lishuang123");
 */
public class TestJDBC {
	public static boolean deleteUser(int id){
		Connection conn = DBUtils.getConnection();;
		PreparedStatement ps = null;
		try {
			String sql = 
					"delete from user where id = ?";
			ps = conn.prepareStatement(sql);// Ԥ�����statement
			// ��sql����еģ���ֵ
			ps.setInt(1, id);
			// ����rs������ж��Ƿ��������û�
			int m = ps.executeUpdate();// ������ݵĲ��롢���º�ɾ��
			return m==1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}
	
	/**
	 * �����û������޸�����
	 * @param password
	 * @return
	 */
	public static boolean updatePassword(User user){
		Connection conn = DBUtils.getConnection();;
		PreparedStatement ps = null;
		try {
			String sql = 
					"update user set password = ? where username = ?";
			ps = conn.prepareStatement(sql);// Ԥ�����statement
			// ��sql����еģ���ֵ
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getUsername());
			// ����rs������ж��Ƿ��������û�
			int m = ps.executeUpdate();// ������ݵĲ��롢���º�ɾ��
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
			ps = conn.prepareStatement(sql);// Ԥ�����statement
			// ��sql����еģ���ֵ
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			// ����rs������ж��Ƿ��������û�
			int m = ps.executeUpdate();// ������ݵĲ��롢���º�ɾ��
			return m==1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, null);
		}
		return false;
	}
	
	
	/**
	 * ��ɶ����ݿ��ж�Ӧ�˺������û��Ĳ�ѯ
	 * @param user
	 * @return �Ƿ���ڸ��û�
	 */
	public static boolean queryUser(User user){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConnection();
			String sql = 
					"select * from user where username = ? and password = ?";
			ps = conn.prepareStatement(sql);// Ԥ�����statement
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			// ����rs������ж��Ƿ��������û�
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
			// 3���������ݣ���ɾ�Ĳ飩
			ps = conn.prepareStatement("select * from user");
			// 4��ִ��sql��ѯ���,�õ������
			rs = ps.executeQuery();
			// ������ݵ�ȡ��������װΪ�����������鿴����ȡ���Ƿ�ɹ�
			list = new ArrayList<User>();
			while(rs.next()){// 5��������ı���
				User user = new User(rs.getInt(1),rs.getString(2),rs.getString(3));
				list.add(user);
			}
			// 6���ر���Դ
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtils.closeAll(conn, ps, rs);
		}
		return list;
	}
}
