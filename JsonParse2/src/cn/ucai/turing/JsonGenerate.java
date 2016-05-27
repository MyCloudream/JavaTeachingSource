package cn.ucai.turing;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

/**
 * 对象转json
 */
public class JsonGenerate {
	public static void main(String[] args) throws Exception{
		Student stu = new Student();
		stu.setName("尚鹏");
		stu.setAge(20);
		Address address1 = new Address();
		address1.setCity("北京");
		address1.setStreet("长安街");
		Address address2 = new Address();
		address2.setCity("成都");
		address2.setStreet("小吃街");
		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address2);
		stu.setAddress(list);
		
		// 对象转json
		JSONObject json = new JSONObject(stu);
		System.out.println(json.toString());
		
	}
}
