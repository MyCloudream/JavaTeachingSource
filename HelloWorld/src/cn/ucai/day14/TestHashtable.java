package cn.ucai.day14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap/Hashtable
 * StringBuilder/StringBuffer ArrayList/Vector
 * HashMap��֧��null��Ϊkey��value�ģ�Hashtable��֧��
 */
public class TestHashtable {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put("username", "zhangsan");
		map.put("password", "123456");
		map.put("email", "zs@ucai.cn");
//		map.put(null, null);
		// ͨ��map�ڲ��ӿ�Entryȡ�����е�key��value
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
