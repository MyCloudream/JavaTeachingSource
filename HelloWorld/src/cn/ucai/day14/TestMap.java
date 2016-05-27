package cn.ucai.day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * key-value:��ֵ��
 */
public class TestMap {
	// �û�����  ��ɾ�Ĳ�
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		// ��ӷ���
		String s0 = map.put("username","zhangsan");
//		System.out.println(s0);// null
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		// ɾ�޲�
//		System.out.println(map.toString());
//		map.remove("username");
		// ���ǵ�֮ǰ�� ���޸ģ�
//		String v = map.put("username", "lisi");
//		System.out.println(v);
//		System.out.println(map.toString());
		// ����keyȡvalue
//		String userName = map.get("username");
//		System.out.println(userName);
		// ����ȡȫ��value�ķ��� 
		// 1
		Collection<String> coll = map.values();
		String[] strArr = coll.toArray(new String[]{});
		for(String s : strArr){
			System.out.println(s);
		}
		// 2
		Iterator<String> it = coll.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println("value:"+value);
		}
	}
}
