package cn.ucai.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map.Entry
 */
public class TestHashMap2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zs@ucai.cn");
		// 通过map内部接口Entry取出所有的key和value
		Set<Map.Entry<String,String>> set = map.entrySet();
		Iterator<Map.Entry<String,String>> it = set.iterator();
		while(it.hasNext()){
			Entry<String,String> entry = it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
