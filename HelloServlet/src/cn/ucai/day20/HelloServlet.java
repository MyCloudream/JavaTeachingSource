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
 * Servlet是一个特殊的java类
 * 继承自HttpServlet的Servlet就可以处理http请求，比如get请求和post请求
 * 可以看作是一个动态的html
 * 
 * 部署
 * 练习：
 * Student类
 * http://localhost:9999/HelloServlet/getStudent请求的时候
 * Student（"尚鹏",20） 把该对象的json格式写到浏览器上
 */
public class HelloServlet extends HttpServlet {
	// 序列化版本号 用于确保序列化和反序列化的时候版本一致
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
    	
    }
    
    // 用于处理get请求
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		Student stu = new Student("尚鹏",20);
		Gson gson = new Gson();
		String str = gson.toJson(stu);
		writer.println(str);
	}

	// 如果post处理方式和get一样，直接调get既可。
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
