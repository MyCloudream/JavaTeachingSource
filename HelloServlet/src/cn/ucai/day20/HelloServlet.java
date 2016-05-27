package cn.ucai.day20;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.ucai.day20.bean.Student;

/**
 * Servlet��һ�������java��
 * �̳���HttpServlet��Servlet�Ϳ��Դ���http���󣬱���get�����post����
 * ���Կ�����һ����̬��html
 * 
 * ����
 * ��ϰ��
 * Student��
 * http://localhost:9999/HelloServlet/getStudent�����ʱ��
 * Student��"����",20�� �Ѹö����json��ʽд���������
 */
public class HelloServlet extends HttpServlet {
	// ���л��汾�� ����ȷ�����л��ͷ����л���ʱ��汾һ��
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
    	
    }
    
    // ���ڴ���get����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		Student stu = new Student("����",20);
		Gson gson = new Gson();
		String str = gson.toJson(stu);
		writer.println(str);
	}

	// ���post����ʽ��getһ����ֱ�ӵ�get�ȿɡ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
