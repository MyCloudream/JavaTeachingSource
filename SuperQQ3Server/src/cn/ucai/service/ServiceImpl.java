package cn.ucai.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.ucai.bean.Contact;
import cn.ucai.bean.User;
import cn.ucai.dao.DaoImpl;
import cn.ucai.dao.IDao;
import cn.ucai.entity.Result;

public class ServiceImpl implements IService {
	private IDao dao = new DaoImpl();
	@Override
	public Result register(User user) {
		Result result = new Result();
		if(dao.existUser(user)){
			result.setMsg("�û����Ѵ���");
			result.setSuccess(false);
		}else{
			boolean flag = dao.insertUser(user);
			if(flag){
				result.setMsg("ע��ɹ�");
			}else{
				result.setMsg("ע��ʧ�ܣ�");
			}
			result.setSuccess(flag);
		}
		return result;
	}
	@Override
	public User login(User user) {
		return dao.findUser(user);
	}
	@Override
	public List<Contact> download_contacts(String userName, int pageId, int pageSize) {
		return dao.getAllFriendsId(userName,pageId,pageSize);
	}
	@Override
	public boolean upload_avatar(HttpServletRequest request, String userName) {
		// 1����ȡͼƬ
		File file = new File("E:/superqq/user_avatar/"+userName+".jpg");
		try {
			// ��ȡͼƬ
			InputStream is = request.getInputStream();
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
			// δ�����...ע�����ĳ�ˢ�͹ر�
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 2���������ݿ�
		if(dao.updateUserAvatar(userName)){
			return true;
		}
		return false;
	}
}
