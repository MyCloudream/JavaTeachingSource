package cn.ucai.day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map����ɾ�Ĳ�
 */
public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zs@ucai.cn");
		System.out.println(map);
		// map�е��޸�
		map.put("username", "lisi");
//		System.out.println(map);
		// ����keyɾ��key-value
//		map.remove("username");
//		System.out.println(map);
		// ����keyȡvalue
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
		
		// ȡ�����е�key Ȼ��ȡ�����е�value
		Set<String> set = map.keySet();
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()){
			String key = it2.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
