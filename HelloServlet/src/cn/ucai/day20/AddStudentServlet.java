package cn.ucai.day20;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ucai.day20.bean.Student;

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddStudentServlet() {
    	
    }
    
    // 接收浏览器中地址栏中的参数，并生成Student对象
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		if(name!=null&&age!=0){
			Student s = new Student(name,age);
			System.out.println(s);
			writer.println("ok");
		}else{
			writer.println("err");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
