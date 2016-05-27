package cn.ucai.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	/**
	 * �õ������ݿ������
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(PropertiesUtil.getValue("sqlDriver","jdbc.properties"));
			String strUrl = PropertiesUtil.getValue("sqlUrl","jdbc.properties");
			conn = DriverManager.getConnection(strUrl);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر��������ݿ�����������Դ
	 * @param conn
	 * @param ment
	 * @param rs
	 */
	public static void closeAll(Connection conn,PreparedStatement ps ,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
