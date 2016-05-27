package cn.ucai.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ��ϰ��
 * 1���½�List���������N��HashMap
 * 2������3��HashMap�������ڱ�ʾ�����û����������û��洢��list�С�
 * 3����list�б��������û��ĸ�����Ϣ
 */
public class TestMapEx {
	public static void main(String[] args) {
		// list�Ĵ���
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
		// ����list
		for(int i=0;i<list.size();i++){
			// ȡ����ÿ��map������һ���û�����Ϣ
			Map<String,String> map = list.get(i);
			Set<String> set = map.keySet();
			// ����map�е����е�key
			Iterator<String> it = set.iterator();
			while(it.hasNext()){
				String key = it.next();
				// ����keyȡ��valueֵ
				String value = map.get(key);
				System.out.println(key+":"+value);
			}
		}

	}
}
