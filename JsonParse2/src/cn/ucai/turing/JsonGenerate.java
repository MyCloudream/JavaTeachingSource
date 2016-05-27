package cn.ucai.turing;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

/**
 * ����תjson
 */
public class JsonGenerate {
	public static void main(String[] args) throws Exception{
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(20);
		Address address1 = new Address();
		address1.setCity("����");
		address1.setStreet("������");
		Address address2 = new Address();
		address2.setCity("�ɶ�");
		address2.setStreet("С�Խ�");
		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address2);
		stu.setAddress(list);
		
		// ����תjson
		JSONObject json = new JSONObject(stu);
		System.out.println(json.toString());
		
	}
}
