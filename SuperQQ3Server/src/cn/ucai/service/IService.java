package cn.ucai.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.ucai.bean.Contact;
import cn.ucai.bean.User;
import cn.ucai.entity.Result;
/**
 * 层与层之间使用接口解耦合
 */
public interface IService {
	public abstract Result register(User user);

	public abstract User login(User user);

	public abstract List<Contact> download_contacts(String userName, int pageId, int pageSize);

	public abstract boolean upload_avatar(HttpServletRequest request, String userName);
}
