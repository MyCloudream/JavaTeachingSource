package cn.ucai.day14;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * HashSet/HashMap
 * TreeSet/TreeMap
 * 一般来说，都是使用String和八中基本数据类型的包装类做key
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Map<User,String> map = new TreeMap<User,String>();
		User u1 = new User("zhangsan","123456","zhangsan@ucai.cn");
		User u2 = new User("lisi","123456","lisi@ucai.cn");
		User u3 = new User("wangwu","123456","wangwu@ucai.cn");
		User u4 = new User("zhaoliu","123456","zhaoliu@ucai.cn");
		map.put(u1, "zhangsan");
		map.put(u2, "zhangsansan");
		map.put(u3, "123456");
		map.put(u4, "wangwu");
		Set<User> set = map.keySet();
		Iterator<User> it = set.iterator();
		while(it.hasNext()){
			User user = it.next();
			System.out.println(user);
		}
	}
}
