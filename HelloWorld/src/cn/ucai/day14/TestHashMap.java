package cn.ucai.day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的增删改查
 */
public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zs@ucai.cn");
		System.out.println(map);
		// map中的修改
		map.put("username", "lisi");
//		System.out.println(map);
		// 根据key删除key-value
//		map.remove("username");
//		System.out.println(map);
		// 根据key取value
//		String value = map.get("email");
//		System.out.println(value);
		
		Collection<String> coll = map.values();
		/*String[] strArr = coll.toArray(new String[]{});
		for(String s:strArr){
			System.out.println(s);
		}*/
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()){
			String val = it.next();
			System.out.println("value:"+val);
		}
		
		// 取得所有的key 然后取出所有的value
		Set<String> set = map.keySet();
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()){
			String key = it2.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
