package cn.ucai.dao;

import java.util.List;

import cn.ucai.bean.Contact;
import cn.ucai.bean.User;

public interface IDao {
	boolean existUser(User user);
	boolean insertUser(User user);
	User findUser(User user);
	List<Contact> getAllFriendsId(String userName, int pageId, int pageSize);
	boolean updateUserAvatar(String userName);
}
