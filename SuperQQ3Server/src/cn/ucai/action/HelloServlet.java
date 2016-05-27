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
 * 1�����json���jar������Ŀ
 * 2������Sqlite���ݿ⣬�ṩʵ����
 * 3��ץȡǰ10���ӿ����ݣ������ĵ�
 * 4���ӿڿ�����1��3,6,7,8,9,10��
 */

@WebServlet("/Server") // �൱��web.xml�е�2������
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IService service = new ServiceImpl();
    public HelloServlet() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡrequest��ֵ
		String strRuq = request.getParameter("request");
		response.setContentType("text/html;charset=utf-8");
		if(strRuq==null){
			response.getWriter().println("�������ʧ��");
		}else{
			switch (strRuq) {// byte char short int ö�� String
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
		// ��ɽ�ͼƬд�뵽��Ӧ��body����ȥ�Ĺ���
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
			// �ر���Դ
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
	// select��* from user where id in();
	// select cid from contact where myuid = 
	// (select id from user where userName = ?) limit ?,?;
	// 1��ץ�ӿڣ������߼�����дSQL���
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
				r.setMsg("�û�����������󣬵�¼ʧ��");
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
		// 1��ȡ���� userName=&nick=&password=
		String userName = request.getParameter("userName");
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		// 123456   MD5����    sjldjfldsjflsajfldsjf  cdsn 
		System.out.println(userName+":"+nick+":"+password);
		// ����϶�
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
	 * ����תjson
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
			// ����ͼƬ���������ݿ��ͷ���ֶ�
			boolean flag = service.upload_avatar(request,userName);
			if(flag){
				// Result 
			}else{
				
			}
		}else{
			// �ϴ�Ⱥͷ��
		}
	}

}
