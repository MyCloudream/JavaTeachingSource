package cn.ucai.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 练习：
 * 1、新建List，里面包含N个HashMap
 * 2、创建3个HashMap对象，用于表示三个用户，将三个用户存储到list中。
 * 3、从list中遍历三个用户的各项信息
 */
public class TestMapEx {
	public static void main(String[] args) {
		// list的创建
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("username", "zhangsan");
		map1.put("password", "123456");
		map1.put("email", "zs@ucai.cn");
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("username", "zhangsan");
		map2.put("password", "123456");
		map2.put("email", "zs@ucai.cn");
		Map<String,String> map3 = new HashMap<String,String>();
		map3.put("username", "zhangsan");
		map3.put("password", "123456");
		map3.put("email", "zs@ucai.cn");
		map3.put("username", "zhangsan3");
		list.add(map1);
		list.add(map2);
		list.add(map3);
		// 遍历list
		for(int i=0;i<list.size();i++){
			// 取出的每个map都包含一个用户的信息
			Map<String,String> map = list.get(i);
			Set<String> set = map.keySet();
			// 迭代map中的所有的key
			Iterator<String> it = set.iterator();
			while(it.hasNext()){
				String key = it.next();
				// 根据key取出value值
				String value = map.get(key);
				System.out.println(key+":"+value);
			}
		}

	}
}
