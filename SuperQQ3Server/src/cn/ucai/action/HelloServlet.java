package cn.ucai.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.ucai.bean.Contact;
import cn.ucai.bean.User;
import cn.ucai.entity.Result;
import cn.ucai.service.IService;
import cn.ucai.service.ServiceImpl;

/**
 * 1、添加json相关jar包到项目
 * 2、根据Sqlite数据库，提供实体类
 * 3、抓取前10个接口数据，更新文档
 * 4、接口开发（1，3,6,7,8,9,10）
 */

@WebServlet("/Server") // 相当于web.xml中的2套配置
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IService service = new ServiceImpl();
    public HelloServlet() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取request的值
		String strRuq = request.getParameter("request");
		response.setContentType("text/html;charset=utf-8");
		if(strRuq==null){
			response.getWriter().println("请求参数失败");
		}else{
			switch (strRuq) {// byte char short int 枚举 String
			case "register":
				register(request,response);
				break;
			case "login":
				login(request,response);
				break;
			case "download_contacts":
				download_contacts(request,response);
				break;
				// Server?request= download_avatar&userName=
			case "download_avatar":
				download_avatar(request,response);
				break;
			default:
				break;
			}
		}
	}
	private void download_avatar(HttpServletRequest request, HttpServletResponse response) {
		// 完成将图片写入到响应的body里面去的过程
		try {
			OutputStream os = response.getOutputStream();
			String userName = request.getParameter("userName");
			File file = new File("E:/superqq/user_avatar/"+userName+".jgp");
			FileInputStream fis = new FileInputStream(file);
			byte[] byArr = new byte[1024*4];
			int b = 0;
			while((b=fis.read(byArr))!=-1){
				os.write(byArr,0,b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			// 关闭资源
		}
	}

	private void download_contacts(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		int pageId = Integer.parseInt(request.getParameter("pageId"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		List<Contact> list = service.download_contacts(userName,pageId,pageSize);
		try {
			PrintWriter pw = response.getWriter();
			/*if(list==null){
				pw.wi
			}else{*/
			String json = getJsonFromObject(list);
			pw.write(json);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// select * from user where id in(select cuid from contact where myuid = (select id from user where userName = ?)) limit ?,?
	// select　* from user where id in();
	// select cid from contact where myuid = 
	// (select id from user where userName = ?) limit ?,?;
	// 1、抓接口，理清逻辑、编写SQL语句
	// 0 1 2 3 4 
	// 0 5 10 15 20 
	private void login(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		User u = service.login(user);
		PrintWriter pw;
		try {
			pw = response.getWriter();
			if(u==null){
				Result r = new Result();
				r.setMsg("用户名或密码错误，登录失败");
				r.setSuccess(false);
				pw.write(getJsonFromObject(r));
			}else{
				u.setResult("ok");
				pw.write(getJsonFromObject(u));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void register(HttpServletRequest request, HttpServletResponse response) {
		// 1、取数据 userName=&nick=&password=
		String userName = request.getParameter("userName");
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		// 123456   MD5加密    sjldjfldsjflsajfldsjf  cdsn 
		System.out.println(userName+":"+nick+":"+password);
		// 解耦合度
		User user = new User();
		user.setUserName(userName);
		user.setNick(nick);
		user.setPassword(password);
		Result result = service.register(user);
		PrintWriter ps = null;
		try {
			ps = response.getWriter();
			ps.write(getJsonFromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 对象转json
	 * @param object
	 * @return
	 */
	public String getJsonFromObject(Object object){
		ObjectMapper om = new ObjectMapper();
		String strResult = null;
		try {
			strResult = om.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return strResult;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strReq = request.getParameter("request");
		switch (strReq) {
		case "upload_avatar":
			upload_avatar(request,response);
			break;
		default:
			break;
		}
	}

	// request=upload_avatar&userName=bj_bj&avatarType=user_avatar
	private void upload_avatar(HttpServletRequest request, HttpServletResponse response) {
		String avatarType = request.getParameter("avatarType");
		if("user_avatar".equals(avatarType)){
			String userName = request.getParameter("userName");
			// 接收图片并更新数据库的头像字段
			boolean flag = service.upload_avatar(request,userName);
			if(flag){
				// Result 
			}else{
				
			}
		}else{
			// 上传群头像
		}
	}

}
